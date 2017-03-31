/**
 * Created by johnyorangeseed on 2/2/17.
 */
import java.util.*;
import java.io.*;

public class RemoveInRange {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Please enter an alphabetical sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n\n");
      Scanner console = new Scanner(System.in);
        //System.out.println("enter your stuff:");
        ArrayList<String> OGlist = new ArrayList<String>();
        ArrayList<String> All = new ArrayList<String>();
        boolean run1 = true;
        while (run1) {

            String forward = console.next();
            if (!forward.equals("lastString")) {
                OGlist.add(forward);
                All.add(forward);
            }
            else if (forward.equals("lastString")) {

                run1 = false;
            }
        }

        System.out.print("Your original list: ["); //prints the original list here
        for (int i = 0; i < All.size() - 1; i++) {
            System.out.print(All.get(i) + ", ");
        }
        System.out.println(All.get(All.size() - 1) + "]\n");

        System.out.println("Now please enter your start String\n");
        String first = console.next(); //These 2 strings act as the alphabetical indees
        System.out.println("Finally, please enter your end String\n");
        String last = console.next();

        for (int i = OGlist.size() - 1; i >= 0; i--) {
            if ((first.compareTo(OGlist.get(i)) <= 0)  && (last.compareTo(OGlist.get(i)) >= 0)) {

                OGlist.remove(i);
            }
        }

        System.out.print("Your reduced list: [");
       for (int i = 0; i < OGlist.size() - 1; i++) {
            System.out.print(OGlist.get(i) + ", ");
        }
        System.out.println(OGlist.get(OGlist.size() - 1) + "]");






    }



}
