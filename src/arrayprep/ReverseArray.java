package arrayprep;


public class ReverseArray {

    public static void ReverseArray(int [] a)
    {
        for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
        {
            if(i == j)
                continue;

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
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

        int [] a = {1,2,3,4};
        ListArray(a);
        ReverseArray(a);
        ListArray(a);
    }
}
