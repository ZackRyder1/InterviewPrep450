package ArrayPrep;

public class NegativeElementsArray {

    public static void swap(int [] a , int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    private static void moveNegativeNum(int[] a) { //move neg to start of Array

        int megPtr = 0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
                swap(a,i,megPtr++);
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

        int [] a = {-1,2,-9,3,4,5,-6,-8,-9,-10};
        ListArray(a);
        moveNegativeNum(a);
        ListArray(a);
    }


}
