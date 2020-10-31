package arrayprep;

public class AlternateNegPos {

    private static void swap(int [] a,int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    private static int moveNegativeNum(int[] a) { //move neg to start of Array

        int negPtr = a.length-1;

        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]<0)
                swap(a,i,negPtr--);
        }
        return negPtr+1;
    }

    private static void makeAlternate(int [] a)
    {
        int negPtr = moveNegativeNum(a);

        if(negPtr == a.length-1 || negPtr == 0)
            return;

        int index=0;
        while(index<a.length && a[index] >=0)
        {
            swap(a,index,negPtr++);
            index+=2;
        }

    }

    public static void main(String[] args) {
        int [] a ={-1,-4,2,3,-4,3,-5,-5,4,3,-7,-9,-8};
        ReverseArray.ListArray(a);
        makeAlternate(a);
        ReverseArray.ListArray(a);
    }
}
