package de.dikodam.eulerproblems.problem4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


internal class Problem4KtTest {

    data class Problem4TestData(val number: Int, val isPalindrome: Boolean)

    fun testDataProvider() = Stream.of(
        Problem4TestData(121, true),
        Problem4TestData(123, false),
        Problem4TestData(5665, true),
        Problem4TestData(5675, false),
        Problem4TestData(5666, false),
        Problem4TestData(12321, true)
    )

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun `number is a palindrome`(testData: Problem4TestData) {
        val (number, isPalindrome) = testData
        assertThat(number.isPalindrome()).isEqualTo(isPalindrome)
    }
}
