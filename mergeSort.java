/**
 * Created by johnyorangeseed on 3/22/17.
 */
import java.util.*;
public class mergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String a[]){
        System.out.println("mergeSort");
        Scanner console = new Scanner(System.in);
        int[] list = new int[4];
        for (int i = 0; i <= 3; i++) {
            list[i] = console.nextInt();
        }

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(merge(list)));

        /*for(int i:list){
            System.out.print(i);
            System.out.print(" ");
        }*/

//        sort(list);
//        doMergeSort(0, 9);
    }

    public static int[] merge(int array[]){
        if (array.length > 1) {
            int[] left = leftSplit(array);
            int[] right = rightSplit(array);
            merge(left);
            merge(right);
            mergef(array, left, right);
        }
        return array;
    }

    /*private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }*/

    public static int[] leftSplit(int[] array) {
        int size = array.length/2;
        int[] left = new int[size];
        for (int i=0; i<size; i++)
            left[i] = array[i];
        return left;
    }

    public static int[] rightSplit(int[] array) {
        int temp = array.length/2;
        int size = array.length-temp;
        int[] right = new int[size];
        for (int i=0; i<size; i++)
            right[i] = array[i+temp];
        return right;
    }

    public static void mergef(int[] result, int[] left, int[] right) {
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < result.length; i++) {
            if (indexRight>=right.length || (indexLeft<left.length && left[indexLeft]<=right[indexRight])) {
                result[i] = left[indexLeft];
                indexLeft++;
            } else {
                result[i] = right[indexRight];
                indexRight++;
            }
        }
    }



    /*private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }*/
}


