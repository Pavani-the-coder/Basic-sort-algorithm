
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavani
 */
public class Bubble_Sort {
    public static void bubblesort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //System.out.print(arr[temp]);
                }
                
                //System.out.println("-----------");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc. nextInt();
        }
        bubblesort(arr);
        System.out.println("-------------------------------");
        for(int ans:arr){
            System.out.println(ans);
        }
    }
}
