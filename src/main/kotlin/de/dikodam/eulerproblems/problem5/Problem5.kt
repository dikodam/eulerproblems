package de.dikodam.eulerproblems.problem5

// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

fun main(args: Array<String>) {
    val range = 1..20
    val smallestDivisibleNumber = generateSequence(1) { i -> i + 1 }
        .find { it isEvenlyDivisibleBy range }
    println("Smallest positive number divisible by all of the number between 1 and 20 is $smallestDivisibleNumber.")
}

infix fun Int.isEvenlyDivisibleBy(range: IntRange): Boolean {
    return range.all { divisor -> this % divisor == 0 }
}