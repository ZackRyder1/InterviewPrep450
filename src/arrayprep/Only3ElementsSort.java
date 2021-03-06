package arrayprep;

public class Only3ElementsSort {

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void sortThreeElements(int[] arr) {
        int  n = arr.length;

        // Initialize ext available positions for
        // smaller (than range) and greater lements
        int start = 0, end = n-1;

        // Traverse elements from left
        for(int i = 0; i <= end;)
        {

            // If current element is smaller than
            // range, put it on next available smaller
            // position.

            if(arr[i] == 0)
            {

                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;

            }

            // If current element is greater than
            // range, put it on next available greater
            // position.
            else if(arr[i] == 2)
            {

                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            }

            else
                i++;
        }
    }

    public static void ListArray(int[] a) {
        System.out.println("------------------------------------");
        System.out.println("Contents of array are:");
        for (int p : a) {
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        int [] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        int[] a = {2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        ListArray(a);
        sortThreeElements(a);
        ListArray(a);


    }
}
