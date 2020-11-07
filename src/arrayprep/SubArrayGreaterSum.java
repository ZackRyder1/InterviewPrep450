package arrayprep;

public class SubArrayGreaterSum {
    public static void main(String[] args) {
        int [] a ={1,2,46,4,5,6,49};
        int sum = 49;
        int min = findMinSubArray(a,sum);
        System.out.println("Minimum subarray having sum greater than "+sum+" is "+min);
    }

    private static int findMinSubArray(int[] a, int sum) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sumSoFar = 0;
        while(end<a.length)
        {
            sumSoFar+=a[end];
            if(sumSoFar>=sum)
            {
                while(sumSoFar-a[start]>=sum)
                    sumSoFar-=a[start++];
                int len = end-start+1;
                if(len<min)
                    min = len;
            }
            end++;
        }
        return min;
    }
}
