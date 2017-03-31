/**
 * Created by johnyorangeseed on 1/30/17.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Arraything {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesTotal = new ArrayList<String>();
        System.out.print("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be specified using\nthe sentinel value lastString, followed by a return.\n\n\n");

//if (console.nextLine().equals("lastString") == false) {
        String temp = "lit";
        String lent = "lit";
        while (temp.equals("lastString") == false) {
            temp = console.nextLine();
            lent = temp.toLowerCase();
            //names.add(temp);
            namesTotal.add(temp);
            boolean doesHave = false;
           // for (int i = 0; i < names.size(); i++) {
                if (names.contains(lent)) {
                    //names.add(temp);
                    doesHave = true;
                }

           // }

          if (doesHave == false) {
              names.add(lent);
          }

        } //end of while loop
//}
//            System.out.println("out of loop " + names.size());
//        if (temp.equals("lastString")) {                          THis is all formatting
//            for (int k = 0; k < names.size(); k++) {
//                System.out.print(names.get(k) + " ");
//                System.out.println();
//            }
//        }
        names.remove(names.get(names.size() - 1));
        namesTotal.remove(namesTotal.get(namesTotal.size() - 1));
        System.out.println(namesTotal.size());
        //System.out.print("\nPlease enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be specified using\nthe sentinel value lastString, followed by a return.\n\n\n");

        System.out.print("Your original list: [");
        for (int r = 0; r < namesTotal.size() - 1; r++) {
            System.out.print(namesTotal.get(r) + ", ");
            //System.out.print(namesTotal.get(namesTotal.size() - 1));
        }
        System.out.print(namesTotal.get(namesTotal.size() - 1));
        System.out.println("]\n");
        System.out.print("Your list with duplicates removed: [");

        for (int y = 0; y < names.size() - 1; y++) {
            System.out.print(names.get(y) + ", ");
            //System.out.print(names.get(names.size() - 1));
        }
        System.out.print(names.get(names.size() - 1));
        System.out.print("]\n");









    }

}
