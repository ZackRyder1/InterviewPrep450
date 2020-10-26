package arrayprep;

import java.util.ArrayList;

public class MergeSortedArray {

    private static void swap(int [] a , int [] b ,int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = b[index2];
        b[index2] = temp;
    }

    private static void shiftAndSwap(int[] b, int j, int lastValue) {
        for(int i=b.length-1;i>j+1;i--)
            b[i] = b[i-1];
        b[j+1] = lastValue;
    }


    private static void  mergeArrays(int [] a,int [] b)
    {
        for(int i=b.length-1,count=1;i>=0;i--,count++)
        {
            int lastValue = b[i];
            int j = a.length-1;
            while(lastValue<a[--j]);
//            swap(a,b,a.length-count,i);
            b[i] = a[a.length-1];
            shiftAndSwap(a,j,lastValue);
        }
    }


    public static void main(String[] args) {

        int ar1[] = {1, 5, 9, 10, 15, 20};
        int ar2[] = {2, 3, 8, 13};

        mergeArrays(ar1,ar2);

        listMergeArrays(ar1,ar2);
    }

    private static void listMergeArrays(int[] ar1, int[] ar2) {
            System.out.println("------------------------------------");
            System.out.println("Result of Merging Sorted Array is: ");
            System.out.println("Array 1:");
            for(int p:ar1)
                System.out.print(p+" ");
            System.out.println();
            System.out.println("Array 2:");
            for(int p:ar2)
                System.out.print(p+" ");
            System.out.println();
            System.out.println("------------------------------------");
    }
}
