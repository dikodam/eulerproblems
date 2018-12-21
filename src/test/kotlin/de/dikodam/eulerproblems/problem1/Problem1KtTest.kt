package de.dikodam.eulerproblems.problem1

import org.assertj.core.api.Assertions.assertThat
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
    fun isMultipleOf(data: TestData) {
        val (number, base, expectedResult) = data
        assertThat(number isMultipleOf base).isEqualTo(expectedResult)
    }
}