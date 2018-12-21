package de.dikodam.eulerproblems.problem3

// What is the largest prime factor of the number 600851475143

fun main(args: Array<String>) {

    println(findFactorsOf(2))
    println(findFactorsOf(3))
    println(findFactorsOf(4))
    println(findFactorsOf(5))
    println(findFactorsOf(6))
    println(findFactorsOf(7))

}

fun findFactorsOf(number: Int): List<Int> {
    var possibleFactors = 2..number
    val foundFactors = mutableListOf<Int>()
    var possibleFactor = possibleFactors.first


    while (possibleFactors.first <= possibleFactors.last) {
        if (possibleFactor isFactorOf number) {
            foundFactors.add(possibleFactor)
            possibleFactors = possibleFactor..(possibleFactors.last / possibleFactor)
        } else {
            possibleFactor++
            possibleFactors = (possibleFactor)..(possibleFactors.last)
        }
    }

    return if (foundFactors.size == 0) listOf(number) else foundFactors
}

infix fun Int.isFactorOf(number: Int): Boolean {
    return number % this == 0
}

