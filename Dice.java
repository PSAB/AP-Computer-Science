import java.util.Scanner;

public class Dice {
  public static void main(String[] args) {
    int first = 0;
    int second = 0;
    int count = 0;

    Scanner console = new Scanner(System.in);
    System.out.print("Enter sum:     ");
    double desired = console.nextInt();
    System.out.print("Enter number of rolls: ");
    double number = console.nextInt();

    //int generator = (int) ((Math.random() * 6) + 1);
    int sum;
    for (int i = 0; i < number; i++ ) {
      first = randomint();
      second = randomint();
      sum = first + second;
      if (sum == desired) {
       count++;
       
       
      }        
    }
    
    double probability = count / number;
    System.out.print("Probability: ");
    System.out.printf("%.4f", probability);
    System.out.println();
    
    
    
    
    
  }
  
  
  
      public static int randomint() {
    int generator = (int) ((Math.random() * 6) + 1);
    return generator;
    }
    
    
}
