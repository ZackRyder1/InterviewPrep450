package arrayprep;

public class CommonElementsArray {

    private static void findCommon(int [] a,int [] b,int [] c)
    {
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length && k<c.length)
        {
            if(a[i] == b[j] && b[j] == c[k])
            {
                System.out.println("Common Element in the three arrays is: "+a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j])
                i++;
            else if(b[j]<c[k])
                j++;
            else
                k++;
        }

    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,6,7};
        int [] b ={1,4,7,8};
        int [] c ={ 5,6,7};
        findCommon(a,b,c);

    }
}
