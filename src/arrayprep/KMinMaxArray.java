package arrayprep;

import DataStructures.Heap;

public class KMinMaxArray {

    public static int findKMax(int [] a , int k)
    {
        Heap minHeap = new Heap(false);

        for(int i=0;i<k;i++)
        {
            minHeap.addValue(a[i]);
        }

        for(int i=k;i<a.length;i++)
        {
            if(minHeap.getMin()< a[i])
            {
                minHeap.extractMin();
                minHeap.addValue(a[i]);
            }
        }

        return minHeap.getMin();
    }

    public static int findKMin(int [] a , int k)
    {
        Heap maxHeap = new Heap(true);

        for(int i=0;i<k;i++)
        {
            maxHeap.addValue(a[i]);
        }

        for(int i=k;i<a.length;i++)
        {
            if(maxHeap.getMax()> a[i])
            {
                maxHeap.extractMax();
                maxHeap.addValue(a[i]);
            }
        }

        return maxHeap.getMax();
    }



    public static void main(String[] args) {
        int [] a = {2,5,4,7,1,6,3};
        int k = 3;
        int min = findKMin(a,k);
        int max = findKMax(a,k);
        System.out.println("The "+ k + "rd largest value is "+ max);
        System.out.println("The "+ k + "rd smallest value is "+ min);
    }
}
