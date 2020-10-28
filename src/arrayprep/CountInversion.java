package arrayprep;

public class CountInversion {

    public static int inversionCount;

    private static void mergeSort(int [] a)
    {
        int len = a.length;

        if(len<2)
            return;

        int mid = len/2;

        int [] leftArr = new int[mid];
        int [] rightArr = new int[len-mid];

        for(int i=0;i<mid;i++)
            leftArr[i] = a[i];

        for(int i=mid;i<len;i++)
            rightArr[i-mid] = a[i];

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,a);

    }

    private static void merge(int[] left, int [] right, int [] arr) {

        int i=0,j=0,k=0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
                arr[k++] = left[i++];
            else
            {
                arr[k++] = right[j++];
                inversionCount+=left.length-i;
            }
        }

        while(i<left.length)
            arr[k++] = left[i++];

        while(j<right.length)
            arr[k++] = right[j++];

    }

    public static void main(String[] args) {
        int [] a = {8,4,2,1};
        ReverseArray.ListArray(a);
        mergeSort(a);
        ReverseArray.ListArray(a);
        System.out.println("The no. of inversions in the Array are : "+inversionCount);
    }
}
