package arrayprep;

import java.util.Arrays;

public class ChocolateDistribution {


    private static int findMinDiff(int[] chocolates,int students) {
        Arrays.sort(chocolates);
        int start = 0;
        int end = students-1;
        int min = Integer.MAX_VALUE;
        while(end<chocolates.length)
        {
            int diff = chocolates[end++] - chocolates[start++];
            if(diff<min)
                min = diff;
        }
        return min;
    }

    public static void main(String[] args) {
        int [] a = {7, 3, 2, 4, 9, 12, 56};
        int diff =  findMinDiff(a,3);
        System.out.println("Minimum difference after distributing the chocolates is "+diff);
    }
}
