package StringPrep;

import java.util.ArrayList;

public class RabinKarpAlgo {

    private static final int base = 26;
    private static final int prime = 5381;

    public static void main(String[] args) {
        String text = "ABBBABCAB";
        String pattern = "BB";

        findPattern(text,pattern);

    }

    private static void findPattern(String text, String pattern) {
        int patternHash = findHash(pattern);
        int textHash =findHash(text.substring(0,pattern.length()));
        if(textHash == patternHash && checkPattern(text.substring(0,pattern.length()),pattern))
            System.out.println("Found pattern at index 0");
        for(int start=1,end = pattern.length();end<text.length();start++,end++)
        {
            int newHash = findHash(text,textHash,start,end);
            textHash=newHash;
            if(newHash == patternHash && checkPattern(text.substring(start,end+1),pattern))
                System.out.println("Found pattern at index "+start);
        }
    }

    private static boolean checkPattern(String substring, String pattern) {
        return substring.equals(pattern);
    }


    private static int findHash(String text ,int prevHash, int start, int end) {
        int excludeCharVal = text.charAt(start-1) - 'A' +1;
        int power = end-start;
        int subtract = (int) ((excludeCharVal * Math.pow(base,power))  % prime);
        int newHash = prevHash  - subtract;
        int charVal = text.charAt(end) -'A' + 1;
        return (newHash * base) + (charVal % prime);
    }

    private static int findHash(String a) {
        int hash = 0;
        for (int i = 0; i <a.length(); i++) {
            int charValue = a.charAt(i) - 'A' + 1;
            int power = a.length()-1 -i;
            hash += charValue * Math.pow(base,power);
            hash%=prime;
        }
        return hash;
    }


}
