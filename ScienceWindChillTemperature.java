
package science.wind.chill.temperature;
import java.util.Scanner;
public class ScienceWindChillTemperature {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit (-58 to 41): ");
        double temp = input.nextDouble();

        System.out.print("Enter wind speed in mph (>=2): ");
        double speed = input.nextDouble();

        
        if (temp < -58 || temp > 41) {
            System.out.println("Invalid temperature");
        } else if (speed < 2) {
            System.out.println("Invalid wind speed");
        } else {
            
        }
    }
    
}
