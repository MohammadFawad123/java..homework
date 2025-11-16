
package find.the.unicode.of.a.character;
import java.util.Scanner;
public class FindTheUnicodeOfACharacter {
public static void main(String[] args) {
 Scanner input= new Scanner(System.in); 
     System.out.println("Enter a charecter");
     char charecter=input.next().charAt(0);
     int unicode=(int)(charecter);
     System.out.println("unicode is" + unicode);
    }
    
}
