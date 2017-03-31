import java.util.Scanner;
public class ChristmasTree {



 public static void main(String[] args) {

Scanner console = new Scanner(System.in);
System.out.println("Please enter height of each segment:");
int height = console.nextInt();
System.out.println("Please enter amount of desired segments: ");
int segnum = console.nextInt();


//printSeg(6, 0);
//printSeg(6, 1);

for (int i = 1; i <= segnum; i++) {
      printSeg(height, segnum - i, ((2 * i) - 1));
    }
    
    
printSpace(height, segnum);
System.out.println("*");
printSpace(height, segnum);
System.out.println("*");

printTheSpace(height, segnum);
System.out.println("*******");   
    
    
    
}





public static void printSeg(int numOfLines, int xtraSpace, int start) { //printSeg (4);

   for (int line = 1; line <= numOfLines; line++) { //replace 4 with numOfLines
           for (int i = 1; i <= ((numOfLines - line)) + xtraSpace; i++) {
                System.out.print(" ");
              }
           for (int i = start; i <= ((2 * line) - 1) + (2 * start) - 2; i++) {
                System.out.print("*");
              }    
         System.out.println();  
        }
        

  }
  
  
public static void printSpace(int height, int segnum) {
  for (int i = 1; i <= (((2 * (height) - 1) + (2 * (segnum) - 1)) / 2) - 1; i++) {
      System.out.print(" "); 
    }

}


public static void printTheSpace(int height, int segnum) {
  for (int i = 1; i <= (((2 * (height) - 1) + (2 * (segnum) - 1)) / 2) - 4; i++) {
       System.out.print(" ");
     }

}






}
 
 
 
 
  
  




