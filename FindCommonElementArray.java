// Create a Java program to find the common elements between two arrays of integers.
import java.util.*;
public class FindCommonElementArray {
    public String findCommanElement(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :arr1){
            map.put(i,1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j: arr2){
            if(map.containsKey(j)){
                sb.append(j);
                sb.append(",");
                map.remove(j);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    FindCommonElementArray obj = new FindCommonElementArray();
        int[] arr1 = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
        int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };
        String res = obj.findCommanElement(arr1,arr2);
        System.out.println(res);
    }
}
