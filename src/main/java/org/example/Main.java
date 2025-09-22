package org.example;

public class Main {
    static void main() {
        System.out.println("Linear Search:");
        System.out.println("Index is: " + linearSearch(new Integer[]{1, 2, 3, 4, 5}, 3)); // Output: 2

        System.out.println();

        System.out.println("Binary Search:");
        System.out.println("Index is: " + binarySearch(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3)); // Output: 2

        System.out.println();
        System.out.println("Insertion Sort:");
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Integer[] sortedArray = insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Bubble Sort:");
        Integer[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr2);
        System.out.print("Sorted array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Selection Sort:");
        Integer[] arr3 = {64, 25, 12, 22, 11};
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(arr3);
        System.out.print("Sorted array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static <T> int linearSearch(T[] arr, T value) {
        for (int i =0;i<arr.length;i++)
        {
            System.out.println("Checking index " + i + ": " + arr[i]);
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static <T> int binarySearch(T[] arr, T value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Checking index " + mid + ": " + arr[mid]);
            if (arr[mid] == value) {
                return mid;
            }
            if (((Comparable<T>) arr[mid]).compareTo(value) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static <T extends Comparable<T>> T[] insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            T temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
