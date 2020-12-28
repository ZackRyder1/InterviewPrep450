package StringPrep;

public class PalindromicSubsequence {
    public static void main(String[] args) {
        String text ="agbdba";
        int len = findSubSeqLen(text);
        System.out.println("Length of longest palindromic subsequence is "+len);
    }

    private static int findSubSeqLen(String text) {
        int [][] table = new int [text.length()][text.length()];

        for(int i=0;i<text.length();i++) //palindrome of len 1
            table[i][i] = 1;

        for(int i=0;i<text.length()-1;i++) //palindrome of len 2
            table[i][i+1] = text.charAt(i) == text.charAt(i+1)?2:1;

        for(int i=2;i<text.length();i++)
            for(int j=0;j+i<text.length();j++) {

                if (text.charAt(j) == text.charAt(j+i))
                    table[j][j+i] = 2 + table[j+1][j + i - 1];
                else
                    table[j][j+i] = Math.max(table[j][j +i - 1], table[j + 1][j+i]);
            }

        return table[0][text.length()-1];
    }
}
