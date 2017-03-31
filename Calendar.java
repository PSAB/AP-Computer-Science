
import java.util.Scanner;

public class Calendar {

    public static String padded(int n, int width) { //being used at line 58
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {   //with width = 4, and s.length = 2, prints out 2 spaces in front of String s
            s = " " + s;
        }
        return s;
    }

    public static void closing(){
        for (int i =0; i < 7; i++)
            System.out.print("+------");
        System.out.print("+");
    }

    public static void printNum(int a){  //called at line 34
        String block = "";
        if (a/10 <0){
            block = padded(a, 5);
        }
        else{
            block = padded(a,4);
        }
        System.out.print(block + "  |");
    }  

    public static int weekLoop(int currNum, int daySeq){ //called at line 68
        System.out.print("\n|");
        for(int b=0; b<daySeq; b++){
            printNum(currNum);
            currNum++;
        }
        return currNum;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);  //scanner is an object with default argument System.in
        System.out.println("Please enter the number of days in the month:");
        int number = console.nextInt();
        System.out.println("Please enter the number of the day of the first Sunday:");
        int sun = console.nextInt();

        int currNum = 1;
        boolean looping = true;

        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        closing(); // prints the boundary line
        if(sun>1){
            System.out.print("\n|"); //gets to the first row, prints the first vert
            for(int a =0; a<8-sun; a++) //for sun = 3, prints empty spaces 5 times
                System.out.print("      |");
        }
        for(int b = 1; b<sun; b++){
            System.out.print(padded(currNum, 4) + "  |"); //prints out 3 spaces in front of single digit #s,vice versa
            currNum++; //counts # of spaces as code goes by in order to limit it
        }
        while(looping){
            currNum = weekLoop(currNum, 7);
            if(currNum+7 > number) //
                looping = false;

        }
        int working = number-currNum+1;
        weekLoop(currNum, number-currNum+1);
        for(int a =0; a<7-working; a++)
            System.out.print("      |");
        System.out.println();
        closing();

    }


}