# Shortest Job First (SJF) Scheduling Algorithm

This Java program demonstrates the Shortest Job First (SJF) scheduling algorithm using a binary search tree (BST) to maintain the order of processes based on their execution time.

## Program Overview

- **Process Class**: The program defines a `Process` class to represent a process with attributes such as process ID, process name, and execution time.

- **Node Class**: A `Node` class is defined to create nodes of a binary search tree. Each node contains a `Process` object and links to left and right child nodes.

- **Insert Method**: The `insert` method is used to insert processes into the binary search tree based on their execution time. Shorter execution times are placed to the left, and longer execution times to the right.

- **Inorder Method**: The `Inorder` method performs an inorder traversal of the binary search tree, printing the processes in the order they will be scheduled.

- **Main Method**: In the main method, several sample processes are created and scheduled using the SJF algorithm. The order of execution is displayed as output.

## How to Use

1. Compile the Java program using your preferred Java compiler. If you're using an Integrated Development Environment (IDE) like Visual Studio Code, you can compile and run the program from there.

2. Run the compiled Java program. This will execute the SJF scheduling algorithm and display the order in which the processes are scheduled.

## Sample Output

Here's an example of the output you can expect:

```plaintext
Processes scheduled using SJF:
Process ID: 4, Name: Process D, Execution Time: 1
Process ID: 2, Name: Process B, Execution Time: 2
Process ID: 1, Name: Process A, Execution Time: 5
Process ID: 3, Name: Process C, Execution Time: 8
