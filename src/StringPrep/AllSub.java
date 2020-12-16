package StringPrep;

import java.util.HashSet;

public class AllSub {
    public static HashSet<String> result = new HashSet<String>();

    public static void main(String[] args) {
        String a = "cab";
        findAllSubSequence(a);
        System.out.println("All subsequence of the string "+ a + " are ");
        System.out.println(result);

    }

    private static void findAllSubSequence(String a) {
        if(a.length() == 1)
        {
            result.add(a);
            return;
        }

        for(int i=a.length()-1;i>=0;i--)
        {
            result.add(a);
            findAllSubSequence(excludeChar(a,i));
        }
    }

    private static String excludeChar(String a, int index) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if(i != index)
                result.append(a.charAt(i));
        }
        return result.toString();
    }
}
