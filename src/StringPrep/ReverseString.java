package StringPrep;

public class ReverseString {

    public static void main(String[] args) {
        String a = "reverse";
        String result = reverseString(a);
        System.out.println("Reverse of the "+ a + " is " + result);
    }

    private static String reverseString(String word) {
        StringBuilder result = new StringBuilder(word.length());
        for(int i=word.length()-1;i>=0;i--)
        {
            char letter = word.charAt(i);
            result.append(letter);
        }
        return result.toString();
    }
}
