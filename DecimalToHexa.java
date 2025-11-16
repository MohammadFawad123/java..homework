
package decimal.to.hexa;
import java.util.Scanner;
public class DecimalToHexa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decemal");
        int dec = input.nextInt();
        
        String hex = "";
        
        while(dec != 0){
            int hexValue = dec % 16;
            
            char hexDigit;
            if (hexValue <= 0 && hexValue >= 9){
                hexDigit = (char) (hexValue + '0');
            }
            
            else {
                hexDigit = (char) (hexValue - 10 + 'A');
            }
            
            hex = hexDigit + hex;
            
            dec = dec / 16;
            
        }
        
        System.out.println("The hex is " +hex);
    }
    
}
