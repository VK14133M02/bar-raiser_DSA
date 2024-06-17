// In an array of integers and a target number x, return the combination of integers from the array which sum up to x.

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str = "Hello! How are you?";
        String result = removeSpecialCharacters(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing special characters: " + result);
    }
    
    public static String removeSpecialCharacters(String str) {
        // Regular expression to match any special character
        String regex = "[^a-zA-Z0-9\\s]";
        // Replace all special characters with empty string
        return str.replaceAll(regex, "");
    }
//another method
    public static String removeSpecialChar(String str){
        String[] special = {"@","#","$","%","^","&","*","(",")","/","*","-","+","~","!"};
        for(String ch : special){
            if(str.contains(ch)){
                str = str.replace(ch,"");
            }
        }
        return str;
    }
}





