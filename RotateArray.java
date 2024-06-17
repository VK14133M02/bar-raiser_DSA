// Write a program that rotates an array n positions.
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int K = 10;
        obj.rotateArray(arr,K);
        System.out.println(Arrays.toString(arr));
    }
    
    public void rotateArray(int[] arr, int K){
        int N = arr.length;
        
        K = K%N;
        reverse(arr,0,N-1);
        reverse(arr,0,K-1);
        reverse(arr,K,N-1);
    }
    
    public void reverse(int[] arr, int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
