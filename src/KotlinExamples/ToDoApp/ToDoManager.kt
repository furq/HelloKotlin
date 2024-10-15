package KotlinExamples.ToDoApp

class ToDoManager {
    val todoList = mutableListOf<String>()

    companion object {
        /**
         * this annotation ensures that the JVM treats the main function as a static entry point,
         * which is necessary for Java-like execution.
         * */
        @JvmStatic
        fun main(args: Array<String>) {
            val todoManager = ToDoManager()
            println("Welcome to the Kotlin To-Do List Manager!")

            while (true) {
                println(
                    "Select option for your To-Do List Manager \n 1- add \n 2- remove \n " +
                            "3- display tasks \n 4- exit"
                )
                var choice: Int
                try {
                    choice = readlnOrNull()?.toInt() ?: throw NumberFormatException()
                } catch (e: NumberFormatException) {
                    println("Invalid input! Please enter a valid integer.")
                    continue  // Re-prompt the user for input
                }

                when (choice) {
                    1 -> todoManager.addTask(todoManager.todoList)
                    2 -> todoManager.removeTask(todoManager.todoList)
                    3 -> todoManager.displayTask(todoManager.todoList)
                    4 -> {
                        println("Exiting... Thank you for using the To-Do List Manager!")
                        break
                    }

                    else -> {
                        println("invalid selection please choose from 1 - 4 option")
                        continue
                    }
                }
            }
        }
    }

    fun addTask(toDoList: MutableList<String>) {
        print("Enter the task to add: ")
        val task = readlnOrNull()?.trim()
        if (!task.isNullOrEmpty()) {
            toDoList.add(task)
            println("Following task has been added successfully \n $task")
        } else println("Task cannot be empty")

    }

    fun displayTask(todoList: MutableList<String>) {
        if (todoList.isEmpty()) {
            println("The to-do list is empty.")
        } else {
            println("Here is your todo list")
            println("+-----------------------+")
            for (i in todoList.indices) {
                println("${i + 1} - ${todoList[i]}")
            }
        }
    }

    private fun removeTask(todoList: MutableList<String>) {
        if (todoList.isEmpty()) {
            println("The to-do list is empty.")
        } else {
            displayTask(todoList)
            println("Enter the task number you want to delete")

            val input = readlnOrNull()?.toIntOrNull() ?: -1

            if (input in 1..todoList.size)
                todoList.removeAt(input - 1)
            else {
                println("illegal input please enter the index number available from 1 the ${todoList.size}")
            }

            println("new todo list is as follows:")
            displayTask(todoList)
        }
    }
}
