
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2 functions are used and called recursively called 
 * merge and merge sort 
 * in merge() the data is compared and merged
 * in merge sort() the array is split continuously.
 * @author Pavani
 */
public class Merge_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    private static void mergesort(int[] arr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(arr.length<=1) return;
        int middle=arr.length/2;
        int leftarr[]=new int[middle];
        int rightarr[]=new int [arr.length-middle];
        
        int i=0;//for left array
        int j=0;//for right array
        
        for(;i<arr.length;i++){
            if(i<middle){
                leftarr[i]=arr[i];
            }
            else{
                rightarr[j]=arr[i];
                j++;
            }
        }
        mergesort(leftarr);
        mergesort(rightarr);
        merge(leftarr,rightarr,arr);
        
    }
    private static void merge(int [] leftarr,int [] rightarr,int [] arr){
        
        int leftsize=arr.length/2;
        int rightsize=arr.length-leftsize;
        int l=0,r=0,i=0;
        
        //the below code is 
        
        while(l<leftsize && r<rightsize){
            if(leftarr[l]< rightarr[r]){
                arr[i]=leftarr[l];
                i++;
                l++;
            }
            else{
                arr[i]=rightarr[r];
                i++;
                r++;
            }
        }
        //for last remaining or when only one is left below is executed
        while(l<leftsize){
            arr[i]=leftarr[l];
            i++;
            l++;
            
        }
        while(r<rightsize){
            arr[i]=rightarr[r];
            i++;
            r++;
        }
        
    }
}
