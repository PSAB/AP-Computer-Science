import java.util.*;
public class FindGCD {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int least = 0;
        System.out.print("Enter an integer: ");
        int first = Math.abs(console.nextInt());
        System.out.print("Enter an integer: ");
        int second = Math.abs(console.nextInt());
        if (first <= second) {
            least = first;
        }
        else if (second < first) {
            least = second;
        }
        //System.out.println("least = " + least);
        if (second == 0) {
            System.out.println("GCD = " + first);
        }
        else {
            getDivisor(least, first, second);
        }
    }
    public static void getDivisor (int n, int first, int second) {
        if (first % n == 0 && second % n == 0) {
            System.out.println("GCD = " + n);
        }
        else {
            getDivisor(n-1, first, second);
        }
    }

}
