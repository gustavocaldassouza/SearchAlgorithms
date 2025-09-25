# SearchAlgorithms

A Java implementation of fundamental search and sorting algorithms with detailed step-by-step execution logging.

## Overview

This project demonstrates the implementation and execution of common search and sorting algorithms in Java. Each algorithm includes detailed logging to show the step-by-step process, making it an excellent resource for learning how these algorithms work.

## Algorithms Implemented

### Search Algorithms

1. **Linear Search** (`linearSearch`)
   - **Time Complexity**: O(n)
   - **Space Complexity**: O(1)
   - **Description**: Sequentially checks each element in the array until the target is found
   - **Best for**: Unsorted arrays or small datasets

2. **Binary Search** (`binarySearch`)
   - **Time Complexity**: O(log n)
   - **Space Complexity**: O(1)
   - **Description**: Efficiently searches a sorted array by repeatedly dividing the search interval in half
   - **Best for**: Sorted arrays, large datasets

### Sorting Algorithms

1. **Bubble Sort** (`bubbleSort`)
   - **Time Complexity**: O(n²)
   - **Space Complexity**: O(1)
   - **Description**: Repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order
   - **Best for**: Educational purposes, small datasets

2. **Insertion Sort** (`insertionSort`)
   - **Time Complexity**: O(n²) worst case, O(n) best case
   - **Space Complexity**: O(1)
   - **Description**: Builds the final sorted array one item at a time by inserting each element into its correct position
   - **Best for**: Small datasets, nearly sorted arrays

3. **Selection Sort** (`selectionSort`)
   - **Time Complexity**: O(n²)
   - **Space Complexity**: O(1)
   - **Description**: Repeatedly finds the minimum element from the unsorted portion and moves it to the beginning
   - **Best for**: Small datasets, when memory writes are costly
## Requirements

- Java 25 or higher
- Maven 3.6+ (for building)

## How to Run

### Using Maven

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd SearchAlgorithms
   ```

2. Compile and run:
   ```bash
   mvn compile exec:java -Dexec.mainClass="org.example.Main"
   ```

### Using Java directly

1. Compile the Java file:
   ```bash
   javac src/main/java/org/example/Main.java
   ```

2. Run the program:
   ```bash
   java -cp src/main/java org.example.Main
   ```
## Algorithm Details

### Linear Search
The linear search algorithm checks each element in the array sequentially until it finds the target value or reaches the end of the array.

### Binary Search
Binary search works on sorted arrays by comparing the target value to the middle element and eliminating half of the remaining elements in each iteration.

### Bubble Sort
Bubble sort repeatedly steps through the array, comparing adjacent elements and swapping them if they are in the wrong order. The process is repeated until no more swaps are needed.

### Insertion Sort
Insertion sort builds the sorted array one element at a time by taking each element and inserting it into its correct position in the already sorted portion of the array.

### Selection Sort
Selection sort finds the minimum element in the unsorted portion of the array and swaps it with the first element of the unsorted portion.

## License

This project is open source and available under the [MIT License](LICENSE).
