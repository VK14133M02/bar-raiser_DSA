class StringReverse {
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j = s.length()-1;
        int k = s.length()/2;
        while(i<k || j>k){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringReverse obj = new StringReverse();
        String s = "Vikram is a King";
        String result = obj.reverseString(s);
        System.out.println(result);
    }
}