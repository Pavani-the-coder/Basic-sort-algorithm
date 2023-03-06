
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavani
 * Quick sort sort the array by partitioning it in the middle using a pivot element. 
 *  then the partitioned array is again split into 2 and recursively calls the function 
 *   TIME COMPLEXITY
 *          BEST CASE O(n log n)
 *          AVERAGE CASE O(n log n)
 *          WORST CASE o(n^2)
 * 
 *  SPACE COMPLEXITY O (log n) due to recursion 
 * 
 */
public class Quicksort {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
                   
      }
      quicksort(arr,0,n-1);
       for(int ans : arr){
           System.out.println(ans);
       }
    }

    private static void quicksort(int[] arr, int start, int end) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if(end <= start) return;
      int pivot= partition(arr,start,end);//middle part or element that must be placed in the middle.
      quicksort(arr,start,pivot-1);//lefthand side sorting 
        quicksort(arr,pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int pivot=arr[end];
        int i=start -1;
        for(int j=start;j<=end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
                arr[i]=arr[end];
                arr[end]=temp;
        
        return i;
    }
}
