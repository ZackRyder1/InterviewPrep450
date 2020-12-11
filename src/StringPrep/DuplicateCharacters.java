package StringPrep;

import arrayprep.ReverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String a = "geeksforgeeks";
        HashSet<Character> duplicates = findDuplicates(a);
        System.out.println("All duplicates in the string are : ");
        System.out.println("----------------------------------------------");
        for(char letter:duplicates)
            System.out.print(letter+" ");


    }

    private static HashSet<Character> findDuplicates(String word) {
        HashSet<Character> set = new HashSet<Character>();
        HashSet<Character> duplicates = new HashSet<Character>();

        for(int i=0;i<word.length();i++)
        {
            char letter = word.charAt(i);
            if(set.contains(letter))
                duplicates.add(letter);
            else
                set.add(letter);
        }
        return duplicates;
    }
}
