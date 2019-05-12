/**
 * Create a program to print Fibonacci series
 * this example is based on kotlin tail recursion means no risk of stack overflow
 *
 * @see <a href="https://medium.com/@fede.lopez/tail-recursion-in-kotlin-a017fc23001b"> tail recursion </a
 */

fun main() {
    //calling Fibonacci tail recursion
    print(fibonacci(10,0,1))
}

fun fibonacci(n: Int, a: Long, b: Long): Long{
    return if (n == 0) a else fibonacci(n-1, b , a+b)
}

