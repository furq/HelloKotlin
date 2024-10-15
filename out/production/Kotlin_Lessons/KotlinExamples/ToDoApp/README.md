# Kotlin To-Do List Manager

## Objective
Write a program to create a **simple To-Do List Manager** program that allows users to perform multiple operations on a list of tasks. This includes:
1. **Adding tasks** to the list.
2. **Removing tasks** from the list by index.
3. **Displaying tasks** to the user.
4. **Handling invalid inputs** (like empty lists or invalid task indices).
5. **Looping** until the user chooses to exit.
6. **Practicing Kotlin concepts** such as:
    - Lists and Mutable Data Structures
    - Functions and Code Reusability
    - Control Flow with `when` Expressions
    - Null Safety and Input Validation

---

## Features
1. **Prompt the user** to input two numbers and select an operation.
2. **Display a menu** to choose from the following options:
    - Add Task
    - Remove Task
    - Display Tasks
    - Exit
3. **Use `when` expressions** to handle user commands.
4. **Check for empty lists** before displaying or removing tasks.
5. **Provide user-friendly messages** for errors and invalid inputs.
6. **Handle null values and input errors** to prevent crashes.

---

## Program Flow
1. **Welcome Message**: The program starts with a welcome message explaining the available commands.
2. **Main Loop**: A `while` loop keeps the program running until the user decides to exit.
3. **Command Handling**:
    - **Add Task**: The user provides a task description, which is added to the list.
    - **Remove Task**: The user enters the index of the task to remove.
    - **Display Tasks**: All tasks are listed with their indices.
    - **Exit**: The program exits gracefully with a goodbye message.
4. **Error Handling**: Invalid inputs are caught, and the user is asked to try again.

---

## Output 

Welcome to the **Kotlin To-Do List Manager!**
You can **add**, **remove**, **display tasks**, or **type 'exit'** to quit.

Enter a command (add, remove, display, exit): add
Enter the task to add: Learn Kotlin
Task added: Learn Kotlin

Enter a command (add, remove, display, exit): display

Your To-Do List:
0: Learn Kotlin

Enter a command (add, remove, display, exit): add
Enter the task to add: Build a to-do list
Task added: Build a to-do list

Enter a command (add, remove, display, exit): display

Your To-Do List:
0: Learn Kotlin
1: Build a to-do list

Enter a command (add, remove, display, exit): remove
Enter the index of the task to remove: 0
Removed task: Learn Kotlin

Enter a command (add, remove, display, exit): display

Your To-Do List:
0: Build a to-do list

Enter a command (add, remove, display, exit): exit
Exiting... Thank you for using the To-Do List Manager!
