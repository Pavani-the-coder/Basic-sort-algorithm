
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavani
 * Time complexity O(n^2)
 * suitable for small datasets only
 *   a variable called min where min value is stored in each iteration and then the value is swapped;
 */
public class selectionSort {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr);
        for(int ans:arr){
            System.out.print(ans+" ");
        }
    }

    private static void selectionsort(int[] arr) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for(int i=0;i<arr.length-1;i++){
           int min=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
       }
    }
}
