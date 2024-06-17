// Write a Java program that removes duplicate elements from an array without using built-in methods
import java.util.*;
public class RemoveDuplicate {
    public void removeDuplicate(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        int N = set.size();
        int[] array = new int[N];
        int index = 0;
        for(int x : set){
            array[index++] = x;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        int[] arr = {1,2,6,2,5,6,8,6,10,12,102,1,0,1,3};
        obj.removeDuplicate(arr);
    }
}
