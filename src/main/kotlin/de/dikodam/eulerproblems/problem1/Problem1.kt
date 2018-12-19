package de.dikodam.eulerproblems.problem1

// https://projecteuler.net/problem=1
// Find the sum of all the multiples of 3 or 5 below 1000.

fun main(args: Array<String>) {

    val sumOfMultiplesOf3Or5 = (1..999)
        .filter { it isMultipleOf 3 || it isMultipleOf 5 }
        .sum()

    println("The sum of the multiples of 3 or 5 below 1000 is $sumOfMultiplesOf3Or5.")
}

infix fun Int.isMultipleOf(base: Int): Boolean {
    return this % base == 0
}