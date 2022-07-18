package org.tophe.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

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
    @CsvSource("1,1", "2,2")
    fun `step1 a single number is evaluated as its value`(inputNumberAsString: String, expectedNumber: Int) {
        // given
        val stringCalculator = StringCalculator()
        // when
        val result = stringCalculator.add(inputNumberAsString)
        // then
        assertThat(result).isEqualTo(expectedNumber)
    }
}