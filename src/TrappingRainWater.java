public class TrappingRainWater {

    private static int findRainWater(int[] a) {
        int totalWater = 0;
        int prev = a[0];
        int previousIndex = 0;
        int temp =  0;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=prev)
            {
                prev = a[i];
                previousIndex = i;
                temp = 0;
            }
            else
            {
                totalWater+= (prev-a[i]);
                temp+=(prev-a[i]);
            }
        }

        if(previousIndex<a.length-1)
        {
            totalWater-=temp;
            prev = a[a.length-1];
            for(int j=a.length-1;j>=0;j--)
            {
                if(a[j]>=prev)
                    prev = a[j];
                else
                    totalWater+= (prev-a[j]);
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int [] a ={3, 0, 2, 0, 4};
        int totalWater = findRainWater(a);
        System.out.println("Total Rain water trapped is "+totalWater);
    }


}
