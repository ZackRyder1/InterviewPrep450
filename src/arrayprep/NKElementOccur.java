package arrayprep;
import java.util.HashMap;

public class NKElementOccur {

    private static void findNKOccurences(int[] a,int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int freqRequired = a.length/k;

        for(int p:a)
        {
            if(freq.containsKey(p))
                freq.put(p,freq.get(p)+1);
            else
                freq.put(p,1);
        }

        for(int p: freq.keySet())
        {

            if(freq.get(p)>=freqRequired)
                System.out.println("One Element with n/k occurences is : "+ p);
        }

    }

    public static void main(String[] args) {
        int [] a = {1,1,2,3,2,3};
        findNKOccurences(a,3);
    }


}
