import java.util.Scanner;
import java.io.*;
public class Personality {

    public static void main(String[] args) throws FileNotFoundException {
Scanner console = new Scanner(System.in);

String fileName = console.nextLine();
Scanner input = new Scanner(new File(fileName));

int count = 0;

int IE_A = 0;
int IE_B = 0;
int SN_A = 0;
int SN_B = 0;
int TF_A = 0;
int TF_B = 0;
int JP_A = 0;
int JP_B = 0;

//int k = 0;
String answers = null;
	System.out.print("Input file name: ");
while (input.hasNext()) {

//k++;
	String temp = input.nextLine();
	
//	System.out.print("Input file name :");
	
	if (temp.length() < 70) {
		System.out.println(temp + ":");
		System.out.print("    ");
	}
	else {
		answers = temp;
		//System.out.println(answers);   //answers contains the respective string of answers for each person

char[] anslist1 = new char[7];
char[] anslist2 = new char[7];
char[] anslist3 = new char[7];
char[] anslist4 = new char[7];
char[] anslist5 = new char[7];   //arrays of every 7 consecutive answers ten times
char[] anslist6 = new char[7];
char[] anslist7 = new char[7];
char[] anslist8 = new char[7];
char[] anslist9 = new char[7];
char[] anslist10 = new char[7];	

	for (int i = 0; i <= 69; i++) {   
		if (i <= 6) {
			anslist1[i] = answers.charAt(i);
		}
		else if (i >= 7 && i <= 13) {
			anslist2[i - 7] = answers.charAt(i);
		}
		else if (i >= 14 && i <= 20) {
			anslist3[i - 14] = answers.charAt(i);
		}
		else if (i >= 21 && i <= 27) {
			anslist4[i - 21] = answers.charAt(i);	
		}
		else if (i >= 28 && i <= 34) {
			anslist5[i - 28] = answers.charAt(i);
		}
		else if (i >= 35 && i <= 41) {
			anslist6[i - 35] = answers.charAt(i);
		}
		else if (i >= 42 && i <= 48) {
			anslist7[i - 42] = answers.charAt(i);
		}
		else if (i >= 49 && i <= 55) {
			anslist8[i - 49] = answers.charAt(i);
		}
		else if (i >= 56 && i <= 62) {
			anslist9[i - 56] = answers.charAt(i);
		}
		else if (i >= 63 && i <= 69) {
			anslist10[i - 63] = answers.charAt(i);
		}
	} //end of for loop		
		
IE_A += manageArr(anslist1, 0); 
IE_B += manageArrB(anslist1, 0);

SN_A += manageArr(anslist1, 1);
SN_A += manageArr(anslist1, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist1, 1);
SN_B += manageArrB(anslist1, 2);

TF_A += manageArr(anslist1, 3);
TF_A += manageArr(anslist1, 4);
TF_B += manageArrB(anslist1, 3);
TF_B += manageArrB(anslist1, 4);

JP_A += manageArr(anslist1, 5);
JP_A += manageArr(anslist1, 6);
JP_B += manageArrB(anslist1, 5);
JP_B += manageArrB(anslist1, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist2, 0); 
IE_B += manageArrB(anslist2, 0);

SN_A += manageArr(anslist2, 1);
SN_A += manageArr(anslist2, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist2, 1);
SN_B += manageArrB(anslist2, 2);

TF_A += manageArr(anslist2, 3);
TF_A += manageArr(anslist2, 4);
TF_B += manageArrB(anslist2, 3);
TF_B += manageArrB(anslist2, 4);

JP_A += manageArr(anslist2, 5);
JP_A += manageArr(anslist2, 6);
JP_B += manageArrB(anslist2, 5);
JP_B += manageArrB(anslist2, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist3, 0); 
IE_B += manageArrB(anslist3, 0);

SN_A += manageArr(anslist3, 1);
SN_A += manageArr(anslist3, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist3, 1);
SN_B += manageArrB(anslist3, 2);

TF_A += manageArr(anslist3, 3);
TF_A += manageArr(anslist3, 4);
TF_B += manageArrB(anslist3, 3);
TF_B += manageArrB(anslist3, 4);

JP_A += manageArr(anslist3, 5);
JP_A += manageArr(anslist3, 6);
JP_B += manageArrB(anslist3, 5);
JP_B += manageArrB(anslist3, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist4, 0); 
IE_B += manageArrB(anslist4, 0);

SN_A += manageArr(anslist4, 1);
SN_A += manageArr(anslist4, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist4, 1);
SN_B += manageArrB(anslist4, 2);

TF_A += manageArr(anslist4, 3);
TF_A += manageArr(anslist4, 4);
TF_B += manageArrB(anslist4, 3);
TF_B += manageArrB(anslist4, 4);

JP_A += manageArr(anslist4, 5);
JP_A += manageArr(anslist4, 6);
JP_B += manageArrB(anslist4, 5);
JP_B += manageArrB(anslist4, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist5, 0); 
IE_B += manageArrB(anslist5, 0);

SN_A += manageArr(anslist5, 1);
SN_A += manageArr(anslist5, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist5, 1);
SN_B += manageArrB(anslist5, 2);

TF_A += manageArr(anslist5, 3);
TF_A += manageArr(anslist5, 4);
TF_B += manageArrB(anslist5, 3);
TF_B += manageArrB(anslist5, 4);

JP_A += manageArr(anslist5, 5);
JP_A += manageArr(anslist5, 6);
JP_B += manageArrB(anslist5, 5);
JP_B += manageArrB(anslist5, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist6, 0); 
IE_B += manageArrB(anslist6, 0);

SN_A += manageArr(anslist6, 1);
SN_A += manageArr(anslist6, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist6, 1);
SN_B += manageArrB(anslist6, 2);

TF_A += manageArr(anslist6, 3);
TF_A += manageArr(anslist6, 4);
TF_B += manageArrB(anslist6, 3);
TF_B += manageArrB(anslist6, 4);

JP_A += manageArr(anslist6, 5);
JP_A += manageArr(anslist6, 6);
JP_B += manageArrB(anslist6, 5);
JP_B += manageArrB(anslist6, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist7, 0); 
IE_B += manageArrB(anslist7, 0);

SN_A += manageArr(anslist7, 1);
SN_A += manageArr(anslist7, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist7, 1);
SN_B += manageArrB(anslist7, 2);

TF_A += manageArr(anslist7, 3);
TF_A += manageArr(anslist7, 4);
TF_B += manageArrB(anslist7, 3);
TF_B += manageArrB(anslist7, 4);

JP_A += manageArr(anslist7, 5);
JP_A += manageArr(anslist7, 6);
JP_B += manageArrB(anslist7, 5);
JP_B += manageArrB(anslist7, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist8, 0); 
IE_B += manageArrB(anslist8, 0);

SN_A += manageArr(anslist8, 1);
SN_A += manageArr(anslist8, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist8, 1);
SN_B += manageArrB(anslist8, 2);

TF_A += manageArr(anslist8, 3);
TF_A += manageArr(anslist8, 4);
TF_B += manageArrB(anslist8, 3);
TF_B += manageArrB(anslist8, 4);

JP_A += manageArr(anslist8, 5);
JP_A += manageArr(anslist8, 6);
JP_B += manageArrB(anslist8, 5);
JP_B += manageArrB(anslist8, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist9, 0); 
IE_B += manageArrB(anslist9, 0);

SN_A += manageArr(anslist9, 1);
SN_A += manageArr(anslist9, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist9, 1);
SN_B += manageArrB(anslist9, 2);

TF_A += manageArr(anslist9, 3);
TF_A += manageArr(anslist9, 4);
TF_B += manageArrB(anslist9, 3);
TF_B += manageArrB(anslist9, 4);

JP_A += manageArr(anslist9, 5);
JP_A += manageArr(anslist9, 6);
JP_B += manageArrB(anslist9, 5);
JP_B += manageArrB(anslist9, 6);
////////////////////////////////////////////////////
IE_A += manageArr(anslist10, 0); 
IE_B += manageArrB(anslist10, 0);

SN_A += manageArr(anslist10, 1);
SN_A += manageArr(anslist10, 2);  //the B's may have to be accounted for for all- possible error
SN_B += manageArrB(anslist10, 1);
SN_B += manageArrB(anslist10, 2);

TF_A += manageArr(anslist10, 3);
TF_A += manageArr(anslist10, 4);
TF_B += manageArrB(anslist10, 3);
TF_B += manageArrB(anslist10, 4);

JP_A += manageArr(anslist10, 5);
JP_A += manageArr(anslist10, 6);
JP_B += manageArrB(anslist10, 5);
JP_B += manageArrB(anslist10, 6);

//////////////////////////////////////////////////// IE SN TF JP

	 		 
		 		 		 		 		
		
 //for loop was here
	/*
	for (int i = 0; i < 7; i++) {
		System.out.println(anslist1[i]);
	} */
	

	System.out.print(IE_A + "A" + "-" + IE_B + "B "); 
	System.out.print(SN_A + "A" + "-" + SN_B + "B "); 
	System.out.print(TF_A + "A" + "-" + TF_B + "B "); 
	System.out.print(JP_A + "A" + "-" + JP_B + "B"); 	
	System.out.println();
	
	//System.out.println(IE_A + "  " + IE_B);
	System.out.print("    [");
	percFormat(IE_B, (IE_A + IE_B));
	System.out.print(", ");
	 percFormat(SN_B, (SN_A + SN_B));
	 System.out.print(", ");
	 percFormat(TF_B, (TF_A + TF_B));
	 System.out.print(", ");
	 percFormat(JP_B, (JP_A + JP_B));
	 System.out.print("] = ");
	 
	 
	 if (percGet(IE_B, (IE_A + IE_B)) == 50) {
	 	System.out.print("X");
	 }
	 else if (percGet(IE_B, (IE_A + IE_B)) > 50) {
	 	System.out.print("I");
	 }
	 else if (percGet(IE_B, (IE_A + IE_B)) < 50){
	 	System.out.print("E");
	 }
	 
	 if (percGet(SN_B, (SN_A + SN_B)) == 50) {	 
	 	System.out.print("X");	
	 }
	 else if (percGet(SN_B, (SN_A + SN_B)) > 50) {
	 	System.out.print("N");
	 }
	 else if (percGet(SN_B, (SN_A + SN_B)) < 50) {
	 	System.out.print("S");
	 }
	 
	 if (percGet(TF_B, (TF_A + TF_B)) == 50) {	 
	 	System.out.print("X");	
	 }
	 else if (percGet(TF_B, (TF_A + TF_B)) > 50) {
	 	System.out.print("F");
	 }
	 else if (percGet(TF_B, (TF_A + TF_B)) < 50) {
	 	System.out.print("T");
	 }
	 
	 if (percGet(JP_B, (JP_A + JP_B)) == 50) {	 
	 	System.out.print("X");	
	 }
	 else if (percGet(JP_B, (JP_A + JP_B)) > 50) {
	 	System.out.print("P");
	 }
	 else if (percGet(JP_B, (JP_A + JP_B)) < 50) {
	 	System.out.print("J");
	 }	 
	 	 
	 
	System.out.println(); 
	if (count < 16) {		
	System.out.println();
	}
	//System.out.println("count = " + count);
	}
	
IE_A = 0;
IE_B = 0;
SN_A = 0;
SN_B = 0;
TF_A = 0;
TF_B = 0;
JP_A = 0;
JP_B = 0;

count++;
	
} //end of while loop











    } //end of main
    
    public static int manageArr(char[] arr, int index) { //index goes from 0 - 6
    	int Acheck = 0;
		if (arr[index] == 'A' || arr[index] == 'a') {
			Acheck++;
			}

    	return Acheck;
    }

    public static int manageArrB(char[] arr, int index) { //index goes from 0 - 6
    	int Bcheck = 0;
		if (arr[index] == 'B' || arr[index] == 'b') {
			Bcheck++;
			}

    	return Bcheck;
    }    
    
    public static void percFormat(int Bcount, int total) {
    	//System.out.println("Bcount = "+ Bcount);
    	//System.out.println("total = "+total);
    	double fraction = (double) Bcount / (double) total;
    	double fractionl = fraction * 100;
    	//System.out.println("DEBUG FRACTION1 = "+fraction);
    	double fractionr = Math.round(fractionl);
		int toInt = (int) fractionr;
    	System.out.print(toInt + "%");
    }
    
    public static int percGet(int Bcount, int total) {
    	//System.out.println("Bcount = "+ Bcount);
    	//System.out.println("total = "+total);
    	double fraction = (double) Bcount / (double) total;
    	double fractionl = fraction * 100;
    	//System.out.println("DEBUG FRACTION1 = "+fraction);
    	double fractionr = Math.round(fractionl);
		int toInt = (int) fractionr;
    	return toInt;
    }    
    
    
    
    
    
    

} //end of class