package arrayprep;

import java.util.Arrays;

public class MinimiseMaxTowerHeight {

    public static int minimiseDifferenceOfTower(int [] a,int k)
    {
        int len = a.length;
        Arrays.sort(a);
        int ans = a[len-1] - a[0];
        int small = a[0] + k;
        int big = a[len-1]-k;

        if(small>big)
        {
            int temp = small;
            small = big;
            big = temp;
        }

        for(int i=1;i<len-1;i++)
        {
            int substract = a[i] - k;
            int addition = a[i] + k;

            if(addition<=big || substract>=small)
                continue;

            if(big - substract >= addition - small)
                big =addition;
            else
                small = substract;
        }
        return Math.min(ans,big-small);
    }

    public static void main(String[] args) {
        int [] arr = {1, 10, 14, 14, 14, 15};
        int k = 6;
        int ans = minimiseDifferenceOfTower(arr,k);
        System.out.println("The Minimum difference in the height of the tower after optimizing it by "+ k + " is : "+ ans);
    }
}
