package KotlinExamples.SimpleCalculator

import java.util.Scanner

class SimpleCalculator {

    private val scanner = Scanner(System.`in`)

    /**
     * we need to use a companion object to define class members that are going to be used independently of
     * any instance of that class. The Kotlin compiler guarantees we will have one and only one instance of
     * a companion object. For those of us with a background in Java and C#, a companion object is similar
     * to static declarations.
     * */
    companion object {
        /**
         * this annotation ensures that the JVM treats the main function as a static entry point,
         * which is necessary for Java-like execution.
         * */
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = SimpleCalculator()  // Create an instance to access methods
            while (true) {
                println(" Choose the following operation to perform")
                println("1- Addition")
                println("2- Subtraction")
                println("3- Multiply")
                println("4- Division")
                println("5- Exit")

                val choice = calculator.scanner.nextInt()

                when (choice) {
                    1 -> calculator.callForInput("add")
                    2 -> calculator.callForInput("subtract")
                    3 -> calculator.callForInput("multiply")
                    4 -> calculator.callForInput("divide")
                    5 -> {
                        println("Exiting... Thank you for using the calculator!")
                        break
                    }
                    else -> "please choose 1-5 options"
                }
            }
        }
    }

    fun callForInput(operation: String) {
        println("Enter first number you would like to $operation")
        val x = scanner.nextDouble()

        println("Enter second number you would like to $operation")
        val y = scanner.nextDouble()

        val result = when (operation) {
            "add" -> x + y
            "subtract" -> x - y
            "multiply" -> x * y
            "divide" -> if (y != 0.0) x / y else {
                println("Error: Division by zero is not allowed")
                return
            }

            else -> {
                println("Invalid operation.")
                return
            }
        }
        println("The result of $operation is: $result")
    }
}