import java.util.Scanner;
public class RomanNum {

    public static void main(String[] args) {
Scanner console = new Scanner(System.in);

System.out.println("Enter number:");
int input = console.nextInt();
int tempNum = input;
//boolean decide;
if (input == 0) {
	System.out.println("Zero not available in Roman num");
	//break;
}

if (input == 9) {
	System.out.println("IX");
}

if (input < 0) {
	System.out.println("No Negative numbers please!");
}

int limit3 = 0; // checks the limit for no more than 3 I's

String symbol = checkNum(input);
System.out.print(symbol);        //printing out the initial symbol
input = input - verifySym(symbol); //input decreased by previous amount

 while (input > 0) {
	symbol = checkNum(input);
	if (symbol == "I") {
		limit3++;
	}
	
if (checkTens(tempNum) > 5 && checkTens(tempNum) < 8) {	//checks remainder
	if (limit3 == 3) {
		//int tempNum = Integer.ParseInt(input);
		 int remainder = checkTens(tempNum);
		 if (remainder < 5) {
		 	System.out.print("IV");
		 	break;
		 }
		 else if (remainder > 5) {
		 	System.out.println("VI");
		 	break;
		 }
	}
}

else if (checkTens(tempNum) < 5 && checkTens(tempNum) >= 4) { //checks remainder
	if (limit3 == 1) {
		//int tempNum = Integer.ParseInt(input);
		 int remainder = checkTens(tempNum);
		 if (remainder < 5) {
		 	System.out.print("IV");
		 	break;
		 }
		 else if (remainder > 5) {
		 	System.out.println("VI");
		 	break;
		 }
	}	
}

else if (checkTens(tempNum) == 9) { //checks remainder DUPLICATE STARTS HERE
String tracking = "temp";
	int lastCheck = tempNum - 9; 
	//boolean check9 = true;
	
	while (lastCheck > 0) {
	tracking = checkNum(lastCheck);
	System.out.print(tracking);
	lastCheck = lastCheck - verifySym(tracking);
	} 
	//for (int i = 1; i <= lastCheck - 1; i++) {
		//System.out.print("X");
	//}
	
	//if (limit3 == 1) {
		//int tempNum = Integer.ParseInt(input);
		/* int remainder = checkTens(tempNum);
		 if (remainder < 5) {
		 	System.out.print("IV");
		 	break;
		 }
		 else if (remainder > 5) {
		 	System.out.println("VI");
		 	break;
		 } */
		 System.out.print("IX");
		 break;
	//}
		
} 
	 
	System.out.print(symbol);
	input = input - verifySym(symbol);
} 




System.out.println();

//All the methods begin starting here

    }
    
    public static String checkNum (int num) {
    	if (num < 5 && num > 0) {
    		return ("I");
    	}
    	else if (num >= 5 && num < 9) {
    		return ("V");
    		
    	}

    	else if (num >= 10 && num < 50) {
    		return ("X");
    	}
    	
    	else if (num >= 50 && num < 100) {
    		return ("L");
    	}
    	
    	else if (num >= 100 && num < 500) {
    		return ("C");
    	}
    	
    	else if (num >= 500 && num < 1000) {
    		return ("D");
    	}
    	
    	else if (num >= 1000) {
    		return ("M");
    	}
    	
    	else {
    	return ("Please enter valid input");
    	}
    	
    }
    
    public static int verifySym (String s) {
    	if (s == "I") {
    		return 1;
    	}
    	
    	else if (s == "V") {
    		return 5;
    	}
    	
    	else if (s == "X") {
    		return 10;
    	}
    	
    	else if (s == "L") {
    		return 50;
    	}
    	
    	else if (s == "C") {
    		return 100;
    	}
    	
    	else if (s == "D") {
    		return 500;
    	}
    	
    	else if (s == "M") {
    		return 1000;
    	}
    	
    	else {
    		return 42;
    	}	
    }
    
    public static int checkTens(int n) {
    	int check1 = n % 10;
    	return check1;
    }
    
    

    





}
