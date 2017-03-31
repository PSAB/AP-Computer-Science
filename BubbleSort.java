/**
 * Created by johnyorangeseed on 3/22/17.
 */
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] list = new int[6];
        for (int i = 0; i <= 5; i++) {
            list[i] = console.nextInt();
        }
        System.out.println("bubbleSort");
        System.out.print("[");
        for (int k = 0; k < list.length - 1; k++) {
            System.out.print(list[k] + ", ");
        }
        System.out.print(list[list.length - 1]);
        System.out.println("]");

        bubbleSort(list);
        System.out.println();


    }
    public static void bubbleSort(int[] list) {
        int i, j, temp = 0;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;


                }

            }
            System.out.print("[");
            for (int k = 0; k < list.length - 1; k++) {
                System.out.print(list[k] + ", ");
            }
            System.out.print(list[list.length - 1]);
            System.out.println("]");
        }
        //return list;
        /*System.out.print("[");
        for (int k = 0; k < list.length - 1; k++) {
            System.out.print(list[k] + ", ");
        }
        System.out.print(list[list.length - 1]);
        System.out.print("]");*/

    }

}
