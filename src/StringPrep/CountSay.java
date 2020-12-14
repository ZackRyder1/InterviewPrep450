package StringPrep;

public class CountSay {
    public static void main(String[] args) {
        int n  =2;
        String result = findNTerm(n);
        System.out.println("The Nth term in the count and say sequence is "+ result);
    }

    private static String findNTerm(int n) {
        String result = "1";
        if(n == 1)
            return result;

        for(int i=2;i<n+1;i++)
            result = calculateNextTerm(result);


        return result;
    }

    private static String calculateNextTerm(String a) {
        StringBuilder resultToAppend = new StringBuilder();
        for(int i=0;i<a.length();i++)
        {   int count = 1;
            while(i+1<a.length() && a.charAt(i) == a.charAt(i+1))
            {
                count++;
                i++;
            }
            resultToAppend.append(count);
            resultToAppend.append(a.charAt(i));
        }

        return resultToAppend.toString();
    }
}
