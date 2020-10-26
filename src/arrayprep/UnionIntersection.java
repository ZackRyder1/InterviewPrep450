package arrayprep;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionIntersection {

    public static int [] union(int [] a,int [] b)
    {
        int [] result = new int [a.length +b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while(i<a.length)
            result[k++] = a[i++];

        while(j<b.length)
            result[k++] = b[j++];

        return result;
    }

    public static ArrayList<Integer> intersection(int [] a, int [] b)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int p:a)
            set.add(p);

        for(int p:b)
        {
            if(set.contains(p))
                result.add(p);
        }

        return result;
    }


    public static void ListArray(int [] a)
    {
        System.out.println("------------------------------------");
        System.out.println("Result of Union is : ");
        for(int p:a)
        {
            System.out.print(p+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    public static void List(ArrayList<Integer> a)
    {
        System.out.println("------------------------------------");
        System.out.println("Result of intersection is :");
        System.out.println(a);
        System.out.println("------------------------------------");

    }

    public static void main(String[] args) {

        int [] arr1 = {1, 3, 4, 5, 7};
        int [] arr2 = {2, 3, 5, 6};

        int [] unionResult = union(arr1,arr2);

        ArrayList<Integer> intersectionResult = intersection(arr1,arr2);
        ListArray(unionResult);
        List(intersectionResult);
    }
}
