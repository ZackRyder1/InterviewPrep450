package arrayprep;

public class Rotate1Array {

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    private static void rotateArrayByOne(int[] a) {

        int processingIndex = 0;

        for(int i=0;i<a.length-1;i++)
        {
            int newPosition = (i+1)%(a.length);
            swap(a,processingIndex,newPosition);
        }

    }

    public static void ListArray(int [] a)
    {
        System.out.println("------------------------------------");
        System.out.println("Contents of array are:");
        for(int p:a)
        {
            System.out.print(p+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }


    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        ListArray(a);
        rotateArrayByOne(a);
        ListArray(a);
    }



}
