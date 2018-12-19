package de.dikodam.eulerproblems.problem2

// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

fun main(args: Array<String>) {
    val getNextFibonacci = getFibonacciGenerator()

    val sumOfFibonaccis = generateSequence(getNextFibonacci)
        .takeWhile { it < 4_000_000 }
        .filter { it % 2 == 0 }
        .sum()

    println("The sum of all even fibonacci up to 4 million is $sumOfFibonaccis.")
}

fun getFibonacciGenerator(): () -> Int {
    var first = 0
    var second = 1
    return {
        val nextFibonnacci = first + second
        first = second
        second = nextFibonnacci
        second
    }
}