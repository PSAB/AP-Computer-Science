import java.util.Arrays;
import java.util.Scanner;


public class Sorting {
    public static void main(String[] args){
        int[] input = new int[10];
        Scanner console = new Scanner(System.in);
        for(int i=0; i<input.length;i++){
            input[i]=console.nextInt();
        }
        System.out.println("selectionSort");
        System.out.println(Arrays.toString(input));
        input = shell(input);
        System.out.println(Arrays.toString(input));
        System.out.println();
    }

    public static int[] shell(int[] array) {
        int o = array.length/2;
        while (o>0) {
            for (int i=o; i<array.length; i++) {
                int u=i;
                int temp=array[i];
                while (u>=o && array[u-o]>temp) {
                    array[u]=array[u-o];
                    u-=o;
                }
                array[u] = temp;
            }
            if (o==2) {
                o=1;
            } else {
                o*=(5.0 / 11);
            }
        }
        return array;
    }

    public static int[] insertion(int array[]){
        int temp;
        int a;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for(a=i-1; (a>=0) && (array[a]>temp); a--){
                array[a+1] = array[a];
            }
            array[a+1]=temp;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
    public static int[] selection(int array[], int index){
        if(index==array.length-1)
            return array;
        int temp = array[index];
        int swap = index;
        for(int i=index; i<array.length; i++){
            if(array[i]<array[swap])
                swap=i;
        }
        array[index]=array[swap];
        array[swap]=temp;
        System.out.println(Arrays.toString(array));
        array=selection(array, index+1);
        return array;
    }
    public static int[] bubble(int array[]){
        int n = array.length;
        int temp;
        int lines=1;
        for(int m=n; m>=0;m--){
            for(int a =0; a<m-1;a++){
                if(array[a]>array[a+1]) {
                    temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
            if(lines<9) {
                lines+=1;
                System.out.println(Arrays.toString(array));
            }
        }
        return array;
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
}
