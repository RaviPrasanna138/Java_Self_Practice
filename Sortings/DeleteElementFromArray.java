package Sortings;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int valueToDelete = 3;  // Value to delete

        System.out.println("Original Array:");
        printArray(array, valueToDelete);

        // Delete element
        int index = -1;
        int numElements = array.length;
        for (int i = 0; i < numElements; i++) {
            if (array[i] == valueToDelete) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < numElements - 1; i++) {
                array[i] = array[i + 1];
            }
            numElements--; // Decrease the count of elements
            System.out.println("Array after deletion:");
            printArray(array, numElements);
        } else {
            System.out.println("Value not found in the array");
        }
    }

    // Function to print the elements of an array
    public static void printArray(int[] arr, int numElements) {
        for (int i = 0; i < numElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
