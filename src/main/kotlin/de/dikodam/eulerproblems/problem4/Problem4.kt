package de.dikodam.eulerproblems.problem4

// Find the largest palindrome made from the product of two 3-digit numbers.

fun main(args: Array<String>) {
    val threeDigitNumbers = 100..999

    val biggestPalindrome = threeDigitNumbers
        .flatMap { firstNumber -> threeDigitNumbers.map { secondNumber -> firstNumber * secondNumber } }
        .filter { it.isPalindrome() }
        .max()

    println("Biggest palindrome is $biggestPalindrome")
}

fun Int.isPalindrome(): Boolean {
    val intString = this.toString()
    val reversed = intString.reversed()
    return intString.asSequence()
        .zip(reversed.asSequence())
        .all { (leftChar, rightChar) -> leftChar == rightChar }
}