package de.dikodam.eulerproblems.problem1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Problem1KtTest {

    data class TestData(val multiple: Int, val base: Int, val expectedResult: Boolean)

    private fun testDataProvider() = Stream.of(
        TestData(multiple = 3, base = 3, expectedResult = true),
        TestData(multiple = 4, base = 3, expectedResult = false),
        TestData(multiple = 5, base = 3, expectedResult = false),
        TestData(multiple = 6, base = 3, expectedResult = true),
        TestData(multiple = 7, base = 3, expectedResult = false),
        TestData(multiple = 8, base = 3, expectedResult = false),
        TestData(multiple = 9, base = 3, expectedResult = true),

        TestData(multiple = 5, base = 5, expectedResult = true),
        TestData(multiple = 6, base = 5, expectedResult = false),
        TestData(multiple = 7, base = 5, expectedResult = false),
        TestData(multiple = 8, base = 5, expectedResult = false),
        TestData(multiple = 9, base = 5, expectedResult = false),
        TestData(multiple = 10, base = 5, expectedResult = true),
        TestData(multiple = 11, base = 5, expectedResult = false)
    )

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun `test parametrized data`(data: TestData) {
        assertThat(data.multiple.isMultipleOf(data.base))
            .isEqualTo(data.expectedResult)
    }


    @Test
    fun `3 is multiple of 3`() {
        assertThat(3.isMultipleOf(3)).isTrue()
    }

    @Test
    fun `4 is not multiple of 3`() {
        assertThat(4.isMultipleOf(3)).isFalse()
    }

    @Test
    fun `5 is not multiple of 3`() {
        assertThat(4.isMultipleOf(3)).isFalse()
    }

    @Test
    fun `6 is multiple of 3`() {
        assertThat(3.isMultipleOf(3)).isTrue()
    }

    @Test
    fun `6 is not multiple of 5`() {
        assertThat(6.isMultipleOf(5)).isFalse()
    }

    @Test
    fun `7 is not multiple of 5`() {
        assertThat(7.isMultipleOf(5)).isFalse()
    }

    @Test
    fun `8 is not multiple of 5`() {
        assertThat(8.isMultipleOf(5)).isFalse()
    }

    @Test
    fun `9 is not multiple of 5`() {
        assertThat(9.isMultipleOf(5)).isFalse()
    }

    @Test
    fun `10 is multiple of 5`() {
        assertThat(10.isMultipleOf(5)).isTrue()
    }
}