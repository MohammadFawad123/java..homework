
package algebra.solve.quadratic.equations;
import java.util.Scanner;
public class AlgebraSolveQuadraticEquations {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the a");
     int a = input.nextInt();
      System.out.println("Enter the b");
     int b = input.nextInt();
      System.out.println("Enter the c");
     int c = input.nextInt();
     double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
     double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
     System.out.println(x1);
     System.out.println(x2);
     
     
     
     
    }
    
}
