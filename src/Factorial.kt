/**
 * Create a program to print Factorial
 * this example is based on kotlin recursion
 */

fun main() {
    print("Enter number for factorial")
    var input = readLine()!!.toInt()
    println("The factorital of number $input is " + factorial(input))
}

fun factorial(i: Int): Long {
    return if (i == 1) i.toLong() else i * factorial(i - 1)
}
