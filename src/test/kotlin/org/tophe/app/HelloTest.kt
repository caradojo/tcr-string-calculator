package org.tophe.app

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class HelloTest {

    @Test
    fun mock() {
        // given
        val helloMock = mock(HelloMock::class.java)
        `when`(helloMock.mockMeMethod()).thenReturn(1234)

        // when
        val mockedValue = helloMock.mockMeMethod()

        // then
        assertThat(mockedValue).isEqualTo(1234)
    }

    @Test
    fun `step1 zero with empty param`() {
        // given
        val stringCalculator = StringCalculator()

        // when
        val result = stringCalculator.add("")

        // then
        assertThat(result).isEqualTo(0)
    }
}
