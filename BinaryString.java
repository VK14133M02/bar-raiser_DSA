//Given a binary string like "0101010101", write a program to put all zeros at the beginning and all ones at the end.
public class BinaryString {
    public void binaryString(String s){
        String bag = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                bag = 0+bag;
            }else if(s.charAt(i) == '1'){
                bag = bag+1;
            }
        }
        System.out.println(bag);
    }
    


    public static void main(String[] args) {
    BinaryString obj = new BinaryString();
        String s = "01010101010";
        obj.binaryString(s);
    }
}
