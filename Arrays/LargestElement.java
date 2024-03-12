import java.util.*;

public class LargestElement {

    static int largestElement(int[] arr, int n) {

        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Taking input for the elements of the array
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calling the largestElement function and printing the result
        int result = largestElement(array, size);
        System.out.println("The largest element in the array is: " + result);

        // Close the scanner
        scanner.close();
    }
}
