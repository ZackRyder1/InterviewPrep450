package arrayprep;

import java.util.ArrayList;

public class DuplicateInArray {

    private static ArrayList<Integer> findDuplicates(int [] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        arr[Math.abs(arr[0])] = -arr[Math.abs(arr[0])];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[Math.abs(arr[i])]>=0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                result.add(Math.abs(arr[i]));
        }

        return result;
    }

    public static void ListArray(ArrayList<Integer> result)
    {
        System.out.println("------------------------------------");
        System.out.println("Duplicates in array are: ");
        System.out.println(result);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 3, 6, 6};
        ListArray(findDuplicates(arr));
    }
}
