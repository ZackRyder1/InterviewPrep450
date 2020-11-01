package arrayprep;

public class MaximumProductSubArray {

    private static int findMaxProductSA(int [] a)
    {
        int maxProduct = a[0],minVal = a[0], maxVal = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<0)
            {
                int temp = minVal;
                minVal = maxVal;
                maxVal = temp;
            }

            maxVal = Math.max(a[i],maxVal*a[i]);
            minVal = Math.min(a[i],minVal*a[i]);

            maxProduct = Math.max(maxVal,maxProduct);
        }
        return maxProduct;
    }


    public static void main(String[] args) {
        int [] a = { 6, -3, -10, 0, 2 };
        System.out.println("The maximum product subarray has a product of "+findMaxProductSA(a));
    }
}
