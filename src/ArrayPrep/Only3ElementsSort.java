package ArrayPrep;

public class Only3ElementsSort {

    public static void swap(int [] a , int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static int [] sortThreeElements(int [] a)
    {
        int zeroPtr= 0;
        int twoPtr = a.length-1;

        for(int i=0;i< twoPtr;i++)
        {

            if(a[i] == 0)
            {
                if(zeroPtr == i)
                {
                    zeroPtr++;
                    continue;
                }
                swap(a,zeroPtr,i);
                if(a[i]== 2)
                {
                    swap(a,twoPtr,i);
                    twoPtr--;
                }
                zeroPtr++;
            }
            else if(a[i] == 2)
            {
                if(twoPtr == i)
                {
                    twoPtr--;
                    continue;
                }

                swap(a,twoPtr,i);
                if(a[i] == 0)
                {
                    swap(a,zeroPtr,i);
                    zeroPtr++;
                }
                twoPtr--;
            }

        }

        return null;
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
        int [] a = {0,1,2,0,0,2,1,0};

        ListArray(a);
        sortThreeElements(a);
        ListArray(a);


    }
}
