
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavani
 * Time complexity O(n^2) best case O(N)
 * better than selection sort less steps than bubble sort.
 * 
 * only compares to left of array 
 * swaps if left is greater than index value
 * 
 */
public class Insertion_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr);
        for(int ans:arr){
            System.out.println(ans);
        }
    }

    private static void insertionsort(int[] arr) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for(int i=1;i<arr.length;i++){
           int temp=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>temp){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
       }
    }
}
