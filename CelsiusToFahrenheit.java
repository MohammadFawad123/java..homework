
package celsius.to.fahrenheit;
import java.util.Scanner;
public class CelsiusToFahrenheit {

    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
  System.out.println("Enter the Fahrenhiet");
  double Fahrenheit = input.nextInt();
      double Celsius = (0.5)*(Fahrenheit-32);
      System.out.println("result " + Celsius);
       
    }
}
