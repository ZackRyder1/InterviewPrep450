package arrayprep;

public class MinSwapReq {

    private static int findMinSwap(int[] a, int k) {
        int kPtr = 0;
        int swap = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=k &&  i != kPtr)
            {
                swap++;
                kPtr++;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        int [] a = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;
        int minSwap = findMinSwap(a,k);
        System.out.println("Minimum swaps to bring all elements less than or equal to "+k+" are "+minSwap);
    }

}
