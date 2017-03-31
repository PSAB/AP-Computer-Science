import java.util.*;


/**
 * Created by johnyorangeseed on 2/7/17.
 */
public class clump {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> clumpList = new ArrayList<String>();
        // prompt here
        System.out.println("\nPlease enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n");
        int isEven = 0;//checks
        String temp = "lit";
        String couplet = "lit";
        String forward = "lit";
        //if ()
        while (forward.equals("stop") == false) {
            forward = console.next();
            list.add(forward);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals("stop")) {
                    list.remove(j);
                }
            }
            isEven++;
            if (isEven == 1) {
                temp = forward;
            }
            if (isEven == 2 && forward.equals("stop") == false) {
                couplet = "(" + temp + " " + forward + ")";
                clumpList.add(couplet);

                isEven = 0;
            }
        }
        if (isEven == 2 && temp.equals("stop") == false) {
            clumpList.add(temp);
        }

        if (list.size() == 0) {
            System.out.println("Your original list: []\n");
            System.out.println("Your clumped list: []");
        }
        else {

            System.out.print("Your original list: [");
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1) + "]");
            System.out.println();


            System.out.print("Your clumped list: [");
            for (int i = 0; i < clumpList.size() - 1; i++) {
                System.out.print(clumpList.get(i) + ", ");
            }
            System.out.println(clumpList.get(clumpList.size() - 1) + "]");
            //System.out.println(temp);
            //System.out.println(isEven);
        }

    }
}
