package StringPrep;

public class BinaryStringSplit {
    public static void main(String[] args) {
        String a = "0100110101";
        int count  = findSubCount(a);
        System.out.println("The number of substring with equal 0s and 1s are " + count);
    }

    private static int findSubCount(String a) {
        int count0= 0 , count1 = 0;
        int count = 0;

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == '0')
                count0++;
            else
                count1++;

            if(count0 == count1)
                count++;
        }

        if(count0 != count1)
            return -1;

        return count;
    }


}
