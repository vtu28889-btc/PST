package tasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        IntStream.range(0, arr.length)
                 .filter(i -> i == index)
                 .findFirst()
                 .ifPresentOrElse(
                     i -> System.out.println("Element at index " + i + " is " + arr[i]),
                     () -> System.out.println("Invalid index!")
                 );

        sc.close();
    }
}