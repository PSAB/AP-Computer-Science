

import java.io.*;
import java.util.*;

public class CountWords2 {
    public static Map wordCount = new HashMap(); // <-- important HashMap declaration
    public static void main(String[] args)
            throws FileNotFoundException {


        Scanner console = new Scanner(System.in);
        System.out.println("Enter text file name/directory:");
        String fileName = console.nextLine();                 // File name entered here
        Scanner input = new Scanner(new File(fileName));

        int lineCount = 0; //counts the number of lines in poem

        while (input.hasNextLine()) { //hasNext() while loop

            String line = input.nextLine();
            //capsCheck(line);
            scanLine(line); // <-- important method that stores distinct words in HashMap
            lineCount++;
        }
        /////////////////////////////////////////////////////////////////////////////



        int addTo = 0;
        int capsCount = 0; //counts the number of capital letters
        boolean isCaps = false;

        System.out.println("word and corresponding occurences:\n");

        for (Object okey : wordCount.keySet()) { //this for loop runs through the HashMap and counts the occurences of each word
            String key = okey.toString();

            //System.out.println(key.charAt(0));
            if (key.charAt(0) >= 65 && key.charAt(0) <= 90) { // conditional within for-loop to check w/ ASC for capitalization
                isCaps = true;
            }


            int value = Integer.parseInt(wordCount.get(okey).toString()); //gets the int value for each String key
            addTo += value;
            if (isCaps) {
                capsCount = capsCount + value;
            }


            isCaps = false;
            System.out.println(key + " --> " + value + " times");
        }                                                           //end of for loop
        System.out.println();
        System.out.println("Total number of distinct words: " + wordCount.size()); //addTo
        System.out.println("Total number of lines: " + lineCount);
        System.out.println("Total size of entire poem: " + addTo);
        System.out.println("Total number of beginning capital letters: " + capsCount);

    }

    public static void scanLine(String line) { // This is the only method in this code. It uses scanner to store each word in
                                               // the HashMap
        //capsCheck(line);
        Scanner linedata = new Scanner(line);

        while (linedata.hasNext()) { // hasNext() while loop

            String word = linedata.next().replaceAll("[^a-zA-Z0-9]","");
            //System.out.println(word);



        }


    }




}


