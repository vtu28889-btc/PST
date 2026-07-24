package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        IntStream.range(0, n).forEach(i -> arr[i] = sc.nextInt());

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .sorted()
                                   .toList();

        if (k >= 1 && k <= list.size())
            System.out.println("Kth Smallest Element = " + list.get(k - 1));
        else
            System.out.println("Invalid K");

        sc.close();
    }
}