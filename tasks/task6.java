package tasks;

import java.util.Scanner;
import java.util.stream.IntStream;

public class task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        IntStream.range(0, n).forEach(i -> arr[i] = sc.nextInt());

        System.out.println("All Possible Pairs:");

        IntStream.range(0, n)
                 .forEach(i ->
                     IntStream.range(i + 1, n)
                              .forEach(j ->
                                  System.out.println(arr[i] + " " + arr[j])
                              ));

        sc.close();
    }
}