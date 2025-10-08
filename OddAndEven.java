
package odd.and.even;
import java.util.Scanner;
public class OddAndEven {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number");
      int number = input.nextInt();
      if(number%2==0)
       System.out.println("even");
      if(number%3==0)
          System.out.println("odd");
          System.out.println("result" + number);
    
}
}
