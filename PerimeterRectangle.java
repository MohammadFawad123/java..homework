
package perimeter.rectangle;
import java.util.Scanner;
public class PerimeterRectangle {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     System.out.println("Enter the lenght");
     double lenght = input.nextDouble();
      System.out.println("Enter the width");
     double width = input.nextDouble();
     double perimeter = 2*(lenght*width);
     System.out.println("result"+perimeter);
     
    }
    
}
