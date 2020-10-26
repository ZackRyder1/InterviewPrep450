package arrayprep;

public class Only3ElementsSort {

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void sortThreeElements(int[] a) {
        int zeroPtr = 0;
        int twoPtr = a.length - 1;

        for (int i = 0; i <= twoPtr; i++) {
            switch (a[i]) {

                case 0:
                    if (zeroPtr == i) {
                        zeroPtr++;
                        continue;
                    }
                    swap(a, zeroPtr, i);
                    if (a[i] == 2) {
                        swap(a, twoPtr, i);
                        twoPtr--;
                    }
                    zeroPtr++;
                    break;
                case 1:
                    break;
                case 2:
                    swap(a, twoPtr, i);
                    if (a[i] == 0) {
                        swap(a, zeroPtr, i);
                        zeroPtr++;
                    }
                    twoPtr--;
                    break;
            }

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
