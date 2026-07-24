package tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        IntStream.range(0, n).forEach(i -> arr[i] = sc.nextInt());

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");

        sc.close();
    }
}