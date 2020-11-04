package arrayprep;

import java.util.Arrays;

public class SumTriplets {

    private static boolean findTriplets(int[] a,int sum) {
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            int start=i+1;
            int end =a.length-1;
            int sumToFind = sum - a[i];
            while(start<end)
            {
                int pairSum = a[start]+a[end];
                if(sumToFind == pairSum)
                    return true;
                else if(sumToFind < pairSum)
                    end--;
                else
                    start++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] a ={1,2,3,80,4,5};
        int sum = 6;
        boolean result = findTriplets(a,sum);
        if(result)
            System.out.println("There exists a triplet with sum "+sum+" in this array");
        else
            System.out.println("There is no triplets in this array with sum "+sum);
    }


}
