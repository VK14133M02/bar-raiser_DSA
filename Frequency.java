//In a given string, count how many times each character has occurred, irrespective of whether the character is in lowercase or uppercase.
import java.util.*;
public class Frequency {
    public void frequency(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Set<Character> keys = map.keySet();
        StringBuilder sb = new StringBuilder();
        for(char key : keys){
            sb.append(key);
            sb.append(map.get(key));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Frequency obj = new Frequency();
        String s = "VIkramMishrA";
        obj.frequency(s);
    }
}
