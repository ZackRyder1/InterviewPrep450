package arrayprep;

public class NextPermutation {

    private static void swap(int [] a,int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    private static void findNextPermutation(int[] arr) {

        boolean flag = true;

        for(int i= arr.length-1;i>0;i--)
            if(arr[i]>arr[i-1])
            {
                flag =false;
                swap(arr,i,i-1);
                break;
            }

        if(flag)
            ReverseArray.reverseArray(arr);

    }


    public static void main(String[] args) {
        int [] a = {4,3,2,1};
        int [] b = {1,2,3,4,5};
        findNextPermutation(b);
        ReverseArray.ListArray(b);
    }


}
