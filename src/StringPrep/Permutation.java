package StringPrep;

public class Permutation {
    public static void main(String[] args) {
        String a = "ABC";
        System.out.println("Permutations of String "+ a + " are");
        findAllPermutations(a,0,a.length()-1);
    }

    private static void findAllPermutations(String a,int l,int r) {

        if(l == r)
        {
            System.out.println(a);
            return;
        }

        for(int i=l;i<a.length();i++)
        {
            a = swap(a,l,i);
            findAllPermutations(a,l+1,r);
            a = swap(a,l,i);
        }

    }

    private static String swap(String a,int l, int i) {
        char []  result = a.toCharArray();
        char temp = result[l];
        result[l] = result[i];
        result[i] = temp;
        return String.valueOf(result);
    }
}
