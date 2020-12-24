package StringPrep;

import java.util.HashMap;

public class KMPAlgo {
    public static void main(String[] args) {
        String text = "abxabcabcabd";
        String pattern = "abcaby";

        findPattern(text,pattern);
    }

    private static void findPattern(String text, String pattern) {
        HashMap<Character,Integer> kmpTable = new HashMap<>();
        int j=0;
        int index =0;
        for(int i=0;i<text.length();i++)
        {
            char charToSearch = text.charAt(i);
            char charInPattern = pattern.charAt(j);
            if(charToSearch == charInPattern)
                kmpTable.put(charInPattern,j++);
            else
                j = checkTable(kmpTable,charToSearch);

            if(j == pattern.length())
            {
                System.out.println("Pattern is present in the text");
                return;
            }
        }
        System.out.println("Pattern is not present in text");
    }

    private static int checkTable(HashMap<Character, Integer> kmpTable, char charToSearch) {
        if(kmpTable.containsKey(charToSearch))
            return kmpTable.get(charToSearch) +1;

        return 0;
    }

}
