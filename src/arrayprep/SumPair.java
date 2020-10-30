package arrayprep;

import java.util.HashSet;

public class SumPair {

    private static int [] findPairs(int [] a,int sum)
    {
        HashSet<Integer> complements = new HashSet<>();
        complements.add(sum-a[0]);

        for(int i=1;i<a.length;i++)
        {
            if(complements.contains(a[i]))
                return new int[]{a[i], sum-a[i]};
            else
                complements.add(sum-a[i]);
        }

        return null;
    }


    public static void main(String[] args) {
        int [] a = {1,2,3,6,6};
        int sum =11;
        a = findPairs(a,sum);
        if(a == null)
            return;
        System.out.println("The Pairs equal to the sum "+ sum + " are :" + a[0] +" & " +a[1]);
    }
}
