package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//PROBLEM STATEMENT:
// you are given an array of integers arr and an integer k.
//your task is to find and print the maximum number in each contiguous window of size k;
//ex-[1,3,-1]->max(3),[3,-1,-3]->max(3)...
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        int max = Integer.MIN_VALUE;
        int j = 0;
        List<Integer> list=new ArrayList<>();
        while (j<=n-k) {
            for (int i = j; i < j + k; i++) {
                max = Math.max(max, arr[i]);
            }
            j++;
            list.add(max);

        }
        System.out.println(list);
    }
}
