import java.io.*;
import java.util.Scanner;
public class Benford {

    public static void main(String[] args) 
    	throws FileNotFoundException {
    
    Scanner console = new Scanner(System.in);

System.out.println("Let’s count those leading digits...");
//System.out.print("input file name?");
//System.out.println();

String fileName = console.nextLine();    // asks for file name
Scanner input = new Scanner(new File(fileName)); //input represents the txt file in the program



//System.out.println("Digit Count Percent");

int total = 0;
//while (input.hasNext()) {
	//String word = input.next();
	//System.out.println(word);
	//total++;

//}

//System.out.println("total words = " + total);
//int[] arr = new int[total];

int count0 = 0;


int count1 = 0;
int count2 = 0;
int count3 = 0;
int count4 = 0;
int count5 = 0;
int count6 = 0;
int count7 = 0;
int count8 = 0;
int count9 = 0;

int firstdig = 0;
for (int i = 1; i <= 9; i++) {
	while (input.hasNext()) {
		total++;
		int count = 0;
		String numString = input.next();
		int num = Integer.parseInt(numString);
		//System.out.println(num);
		firstdig = (int) (num / 100);
		if (firstdig == 0) {
			count0++;
		}
		
		if (firstdig == 1) {
			count1++;
		}
		else if (firstdig == 2) {
			count2++;
		}
		else if (firstdig == 3) {
			count3++;
		}
		else if (firstdig == 4) {
			count4++;
		}
		else if (firstdig == 5) {
			count5++;
		}
		else if (firstdig == 6) {
			count6++;
		}
		else if (firstdig == 7) {
			count7++;
		}
		else if (firstdig == 8) {
			count8++;
		}
		else if (firstdig == 9) {
			count9++;
		}
		
		//System.out.println("count = " + count);
		//univCount = count;
	}
//double percent = univCount / total;

 }
 
 double worldCount = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9;
 int formal = (int) worldCount;
 //boolean check0 = false;
System.out.print("input file name?");
if (count0 > 0) {
	System.out.print(" excluding " + count0 + " zeros");
	System.out.println();
	//check0 = true;
}

if (count0 > 0) { 
System.out.println("Digit Count Percent");
}
else if (count0 == 0) {
	System.out.println(" Digit Count Percent");
}

if (count1 < 10) {
	System.out.print("    1    " + " " + count1);
}
else {
		System.out.print("    1    " + count1);
}

System.out.printf("%7.2f", (count1 / worldCount) * 100);
System.out.println();

if (count2 < 10) {
	System.out.print("    2    " + " " + count2);
}
else {
	System.out.print("    2    " + count2);
}

System.out.printf("%7.2f", (count2 / worldCount) * 100);
System.out.println();

if (count3 < 10) {
	System.out.print("    3    " + " " + count3);
}
else {
	System.out.print("    3    " + count3);
}

System.out.printf("%7.2f", (count3 / worldCount) * 100);
System.out.println();

if (count4 < 10) {
	System.out.print("    4    " + " " + count4);
}
else {
	System.out.print("    4    " + count4);	
}

System.out.printf("%7.2f", (count4 / worldCount) * 100);
System.out.println();

if (count5 < 10) {
	System.out.print("    5    " + " " + count5);
}
else {
	System.out.print("    5    " +  count5);
}	

System.out.printf("%7.2f", (count5 / worldCount) * 100);
System.out.println();

if (count6 < 10) {
	System.out.print("    6    " + " " + count6);
}
else {
	System.out.print("    6    " + count6);	
}

System.out.printf("%7.2f", (count6 / worldCount) * 100);
System.out.println();

if (count7 < 10) {
	System.out.print("    7    " + " " + count7);
}
else {
	System.out.print("    7    " +  count7);	
}

System.out.printf("%7.2f", (count7 / worldCount) * 100);
System.out.println();

if (count8 < 10) {
	System.out.print("    8    " + " " + count8);
}
else {
	System.out.print("    8    " + count8);	
}

System.out.printf("%7.2f", (count8 / worldCount) * 100);
System.out.println();

if (count9 < 10) {
	System.out.print("    9    " + " " + count9);
}
else {
	System.out.print("    9    " +  count9);
}

System.out.printf("%7.2f", (count9 / worldCount) * 100);
System.out.println();

System.out.println("Total    " + formal + " " + "100.00");




/*
int counter = 0;
while (input.hasNext()) {
	String word = input.next();
	System.out.println(word);
	counter++;

}

System.out.println("total words = " + countre);


 */







    }
    
    

}