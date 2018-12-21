package de.dikodam.eulerproblems.problem3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Problem3KtTest {

    data class TestData(val number: Int, val expectedFactors: List<Int>)

    fun testDataProvider() = Stream.of(
        TestData(2, listOf(2)),
        TestData(3, listOf(3)),
        TestData(4, listOf(2, 2)),
        TestData(5, listOf(5)),
        TestData(6, listOf(2, 3)),
        TestData(7, listOf(7)),
        TestData(8, listOf(2, 2, 2)),
        TestData(9, listOf(3, 3)),
        TestData(10, listOf(2, 5)),
        TestData(11, listOf(11)),
        TestData(12, listOf(2, 2, 3))
    )

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun testFindFactorsOf(data: TestData) {
        val (number, factors) = data
        assertThat(findFactorsOf(number)).containsAll(factors)
    }
}