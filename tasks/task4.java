package tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        IntStream.range(0, n).forEach(i -> arr[i] = sc.nextInt());

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Maximum Element = " + max);

        sc.close();
    }
}