package StringPrep;

public class PalindromeString {
    public static void main(String[] args) {
        String a = "aabaa";
        boolean result = findPalindrome(a);
        System.out.println("The given string is " + (result?"":"not ") + "a Palindrome");
    }

    private static boolean findPalindrome(String word) {
        int start = 0;
        int end = word.length()-1;

        while(start<end)
        {
            if(checkIndexChar(word,start++,end--)) {

            }
            else
                return false;
        }
        return true;
    }

    private static boolean checkIndexChar(String word, int start, int end) {
        return word.charAt(start) == word.charAt(end);
    }


}
