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

Welcome to the **Kotlin** To-Do List Manager!  
Select option for your To-Do List Manager.  
1- add  
2- remove. 
3- display tasks. 
4- exit.  
1  
Enter the task to add: Finish this code in Kotlin.  
Following task has been added successfully.  
Finish this code in Kotlin.  
Select option for your To-Do List Manager   
1- add.  
2- remove.  
3- display tasks.  
4- exit.  
1  
Enter the task to add: Write another program in Kotlin.  
Following task has been added successfully.   
Write another program in Kotlin.  
Select option for your To-Do List Manager.  
1- add.  
2- remove.  
3- display tasks.  
4- exit.  
1  
Enter the task to add: commit my code to git.  
Following task has been added successfully.  
commit my code to git.  
Select option for your To-Do List Manager.  
1- add.   
2- remove.   
3- display tasks.   
4- exit.  
3  
Here is your todo list.   
+-----------------------+.   
1 - Finish this code in Kotlin.   
2 - Write another program in Kotlin.    
3 - commit my code to git.   
Select option for your To-Do List Manager.   
1- add.   
2- remove.  
3- display tasks.   
4- exit.  
2 
Here is your todo list.  
+-----------------------+.   
1 - Finish this code in Kotlin.    
2 - Write another program in Kotlin.   
3 - commit my code to git.   
Enter the task number you want to delete.   
1  
new todo list is as follows:      
Here is your todo list.  
+-----------------------+.   
1 - Write another program in Kotlin.   
2 - commit my code to git.   
Select option for your To-Do List Manager.    
1- add.   
2- remove.   
3- display tasks.  
4- exit.
2  
Here is your todo list.  
+-----------------------+.  
1 - Write another program in Kotlin.  
2 - commit my code to git.  
Enter the task number you want to delete.
3  
illegal input please enter the index number available from 1 the 2.  
new todo list is as follows:    
Here is your todo list.   
+-----------------------+.    
1 - Write another program in Kotlin.  
2 - commit my code to git    
Select option for your To-Do List Manager.   
1- add.  
2- remove.   
3- display tasks.   
4- exit.   
12312       
invalid selection please choose from 1 - 4 option.    
Select option for your To-Do List Manager.    
1- add.  
2- remove.  
3- display tasks.   
4- exit.   