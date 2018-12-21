package de.dikodam.eulerproblems.problem5

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Problem5KtTest {

    data class Problem5TestData(val number: Int, val divisorRange: IntRange, val expectedResult: Boolean)

    fun testDataProvider() = Stream.of(
        Problem5TestData(12, 1..4, true),
        Problem5TestData(12, 1..5, false),
        Problem5TestData(2520, 1..10, true)
    )

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun `number is evenly divisible by divisor range`(testData: Problem5TestData) {
        val (number, divisorRange, expectedResult) = testData
        assertThat(number isEvenlyDivisibleBy divisorRange).isEqualTo(expectedResult)
    }
}