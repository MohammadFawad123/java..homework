
package change.dollar;
import java.util.Scanner;
public class ChangeDollar {

 public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an ammount to change");
        double ammount = input.nextDouble();
        
        int ramingammount = (int) ammount *100;
        
        int numberOfOneDollor = ramingammount / 100;
        ramingammount = ramingammount % 100 ;
    }
    
}
