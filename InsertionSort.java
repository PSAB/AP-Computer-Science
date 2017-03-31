import java.util.*;

/**
 * Created by johnyorangeseed on 3/22/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] lister = new int[6];
        for (int i = 0; i <= 5; i++) {
            lister[i] = console.nextInt();
        }
        System.out.println("insertionSort");
        System.out.print("[");
        for (int i = 0; i < lister.length - 1; i++) {
            System.out.print(lister[i] + ", ");
        }
        System.out.println(lister[lister.length - 1] + "]");


        insertion(lister);
        System.out.println();
        //System.out.println(insertion(lister).toString());
        //System.out.println(list);

    }

    public static int[] insertion(int array[]){
        int temp;
        int a;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for(a=i-1; (a >= 0) && (array[a]>temp); a--){
                array[a+1] = array[a];
            }
            array[a+1]=temp;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

}