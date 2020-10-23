package ArrayPrep;

public class MaxSumSubarray {

    public static int findMaxSum(int [] a) //Kadane Algorithm
    {
        int maxEndingHere = 0;
        int maxSoFar = 0;

        for(int p:a)
        {
            maxEndingHere+=p;
            if(maxSoFar<maxEndingHere)
                maxSoFar = maxEndingHere;
            if(maxEndingHere<0)
                maxEndingHere = 0;
        }

        return maxSoFar;
    }

    public static void main(String[] args) {

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = findMaxSum(a);

        System.out.println("Largest Sum Contiguous Subarray is: " + sum);


    }
}
