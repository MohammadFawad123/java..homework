
package lover.pkgcase.and.uppercase;
import java.util.Scanner;
public class LoverCaseAndUppercase {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a charecter");
       char charecter = input.next().charAt(0);
       
       if (charecter >='a' && charecter <='z'){
           System.out.println("Lowecase");
       }
       else if (charecter >= 'A' && charecter <= 'Z'){
           System.out.println("UpperCase");
       }
       else if (charecter>='0' && charecter <='9'){
           System.out.println("Number");
       }
       else {
           System.out.println("Sambool");
       }
    }
    
}
