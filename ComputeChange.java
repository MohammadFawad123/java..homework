
package compute.change;
import java.util.Scanner;
public class ComputeChange {
public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println(" Enter the Amount");
      String ammount=input.next();
        int dotindex = ammount.indexOf('.');
        int dollor = Integer.parseInt(ammount.substring(0, dotindex));
        int cent = Integer.parseInt(ammount.substring(dotindex+1));
        
        
        int total_cent = dollor * 100 + cent ;
        int qurter = total_cent / 25;
        total_cent%=25;
        
        int dimi = total_cent/10;
        total_cent%=10;
        
        int nikils = total_cent / 5 ;
        total_cent%=5;
        
        
        int pennies = total_cent;
        System.out.println("Your ammount is ");
        
        System.out.println("Dollor " + dollor);
        System.out.println("qurter " + qurter);
        System.out.println("dimi " + dimi);
        System.out.println("nukis " + nikils);
        System.out.println("pennies " + pennies);
    }
    
}
