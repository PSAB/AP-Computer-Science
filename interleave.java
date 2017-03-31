import java.util.*;
public class interleave {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        int forward = console.nextInt();

        while(forward!=0){
            list1.add(forward);
            forward = console.nextInt();
        }

        System.out.println("Your first list: " + list1);
        System.out.println("\nPlease enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
        forward = console.nextInt();

        while(forward!=0){
            list2.add(forward);
            forward = console.nextInt();
        }

        System.out.println("Your second list: " + list2 + "\n");
        for(int i=0; i<list2.size(); i++){
            if(i * 2 < list1.size())
                list1.add(i * 2 + 1, list2.get(i));
            else
                list1.add(list2.get(i));
        }
        System.out.println("Your interleaved list: " + list1);
    }


       /*
Please enter a sequence of integers separated
by spaces. End the sequence with the sentinel
value 0, followed by a return.

0
Your first list: []

Please enter a sequence of integers separated
by spaces. End the sequence with the sentinel
value 0, followed by a return.

0
Your second list: []
Your interleaved list: []*/


    

}
