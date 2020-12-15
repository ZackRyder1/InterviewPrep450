package StringPrep;

public class LongestPalindrome {
    public static void main(String[] args) {
        String a = "wcdcwslopols";
        int length = findLongestPalindrome(a);
        System.out.println("The length of palindromic substring is "+length);
    }

    private static int findLongestPalindrome(String a) {
        int[][] table = new int [a.length()][a.length()];
        int maxlen = 1;
        initDPTable(table);

        for(int i=0;i+1<a.length();i++) //palindrome of length 2
        {
            if(a.charAt(i) == a.charAt(i+1))
            {
                table[i][i+1] = 1;
                maxlen=2;
            }
        }

        for(int i=2;i<a.length();i++)
            for(int j=0;j+i<a.length();j++)
            {
                if(a.charAt(j) == a.charAt(j+i) && table[j+1][j+i-1] == 1)
                {
                    table[j][j+i] = 1;
                    maxlen = i+1;
                }
            }

        return maxlen;

    }

    private static void initDPTable(int[][] table) {
        for(int i=0;i<table.length;i++)
            table[i][i] = 1;
    }
}
