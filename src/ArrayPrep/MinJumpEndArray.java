package ArrayPrep;

public class MinJumpEndArray {

    private static boolean canReach(int source,int destination,int steps)
    {
        return destination-source<=steps;
    }

    private static int findMinJumps(int[] a) {
        int [] minJumps = new int [a.length];

        initialiseMinJumpsArray(minJumps);

        for(int i=1;i<a.length;i++)
            for(int j=0;j<i;j++)
            {
                if(canReach(j,i,a[j]))
                {
                    if(minJumps[i]>minJumps[j]+1) {
                        minJumps[i] = minJumps[j] + 1;
//                        actualjumps[i] = j; //init actualJumps to build solution for the jumps Path
                    }
                }
            }


        return minJumps[a.length-1];
    }

    private static void initialiseMinJumpsArray(int[] minJumps) {

        minJumps[0] = 0;
        for(int i=1;i<minJumps.length;i++)
            minJumps[i] = Integer.MAX_VALUE;

    }

    public static void main(String[] args) {
//        int [] a = {3,5,2,1,0,0};
        int [] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int minJumps = findMinJumps(a);
        System.out.println(minJumps);
    }


}
