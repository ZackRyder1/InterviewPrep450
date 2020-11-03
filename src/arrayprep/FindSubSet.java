package arrayprep;

import java.util.HashSet;

public class FindSubSet {

    private static void findIfSubset(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        boolean firstSmall;

        firstSmall = a.length < b.length;

        for(int p:a)
            set.add(p);

        boolean flag = true;

        for(int p:b)
        {
            if(!(set.contains(p)))
            {
                flag = false;
                break;
            }
        }

        if(!flag)
        {
            System.out.println("Both are not subsets of each other");
            return;
        }

        if(firstSmall)
            System.out.println("First array is subset of Second Array");
        else
            System.out.println("Second array is subset of First Array");


    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = {1,2,3,4};

        findIfSubset(a,b);
    }


}
