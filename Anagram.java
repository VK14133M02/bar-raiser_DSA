// Create a program to check if a given word is an anagram of another word

import java.util.*;
public class Anagram {
    public boolean anagram(String a, String b){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        
        for(int j=0;j<b.length();j++){
            char ch = b.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }else{
                return false;
            }
        }
        
        Set<Character> keys = map.keySet();
        for(char key : keys){
            if(map.get(key) != 0){
                return false;
            }
        }
        return true;
    }    

    public static void main(String[] args) {
    Anagram obj = new Anagram();
        String a = "aabccdef";
        String b = "aabccdef";
        boolean res = obj.anagram(a,b);
        System.out.println(res);
    }
}
