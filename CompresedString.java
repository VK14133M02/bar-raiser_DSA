//Given a string, write a program to return a compressed version of the string. For example, for the string "aaabbcc", the output should be "a3b2c2".

public class CompresedString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        CompresedString obj = new CompresedString();
        String s = "aabbccaaaa";
        obj.compressedString(s);
    }
    
    public void compressedString(String s){
        StringBuilder sb = new StringBuilder();
        char temp = s.charAt(0);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(temp != s.charAt(i)){
                sb.append(temp);
                sb.append(count);
                temp = s.charAt(i);
                count = 1;
            }else{
                count++;
            }                      
        }

        sb.append(temp);
        sb.append(count);


        if(sb.toString().length() >= s.length()){
            System.out.println(s);
        }else{
            System.out.println(sb.toString());
        }
    }
}
