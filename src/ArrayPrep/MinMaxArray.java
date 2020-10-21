package ArrayPrep;

public class MinMaxArray {
    public static int [] MinMax(int [] numbers)
    {
        int [] result = new int [2];// 0-min 1-max
        result[0] = numbers[0];
        result[1] = numbers[0];

        for(int num:numbers)
        {
            if(result[0] > num)
                result[0] = num;

            if(result[1] < num)
                result[1] = num;
        }

        return result;
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

        int [] a = {2,5,7,4,1};
        a = MinMax(a);
        System.out.println("The Min number in the array is "+ a[0]);
        System.out.println("The Max number in the array is "+ a[1]);
    }
}
