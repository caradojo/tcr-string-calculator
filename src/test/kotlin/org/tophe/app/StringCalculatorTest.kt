package org.tophe.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class StringCalculatorTest {

    @Test
    fun `step1 zero with empty param`() {
        // given
        val stringCalculator = StringCalculator()

        // when
        val result = stringCalculator.add("")

        // then
        assertThat(result).isEqualTo(0)
    }

    @ParameterizedTest
    @CsvSource("1,1", "2,2", "13,13")
    fun `step1 a single number is evaluated as its value`(inputNumberAsString: String, expectedNumber: Int) {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.add(inputNumberAsString)
        // then
        assertThat(result).isEqualTo(expectedNumber)
    }

    @ParameterizedTest
    @CsvSource("1,2:3", "2,3:5", "1,2,3:6", "10,2,0,20:32", delimiter = ':')
    fun `step1 several number separated with commas`(inputNumberAsString: String, expectedNumber: Int) {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.add(inputNumberAsString)
        // then
        assertThat(result).isEqualTo(expectedNumber)
    }
}
