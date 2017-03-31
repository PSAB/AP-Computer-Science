/**
 * Created by johnyorangeseed on 2/26/17.
 */
import java.util.*;
public class PEEB4 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        double emm = console.nextDouble();
        String emmString = String.valueOf(emm);
        System.out.print("Calculate surface temperature as a function of\nemissivity for the single-layer atmosphere model.\nenter emissivity: emissivity (= absorptivity) = " + emmString);
        System.out.println();

        int temp = (int) Math.round(Math.pow((1.4 * 342) / (0.0000000567 * (2 - emm)), 0.25));
        System.out.println("surface temperature = " + temp + "K");

    }
}
