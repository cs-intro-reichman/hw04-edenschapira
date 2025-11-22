public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
              newStr += (char) (ch + 32); 
            } else {
              newStr += ch; 
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        if(str2Length == 0){
            return true;
        }
        if(str1Length < str2Length){
            return false;
        }
        for (int i = 0; i <= str1Length - str2Length; i++){
            boolean matchFound = true;
            for(int j = 0; j < str2Length; j++){
                if (str1.charAt(i + j) != str2.charAt(j)){
                    matchFound = false; break; //move to next i
                }
            }
            if (matchFound) {
            return true;
            }
        }
        return false;
    }

}
