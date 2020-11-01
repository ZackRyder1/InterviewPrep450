package arrayprep;

import java.util.HashSet;

public class ZeroSum {

    private static boolean findZeroSum(int [] a)
    {
        HashSet<Integer> sums = new HashSet<>();
        int sum = 0;
        for(int p:a)
        {
            sum+=p;
            if(sums.contains(sum))
                return true;
            else
                sums.add(p);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] a = {4, 2, -3, 1, 6};
        boolean result = findZeroSum(a);
        if(result)
            System.out.println("There exists a subarray with sum zero");
        else
            System.out.println("No subarray exists with sum zero");
    }
}
