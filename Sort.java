// Given an integer array, sort the array using your own logic. Do not use any predefined sorting methods.

import java.util.*;
public class Sort {
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Sort obj = new Sort();
        int[] arr = {1,3,2,3,5,6,5,8,1,3,5};
        obj.sort(arr);
    }
}
