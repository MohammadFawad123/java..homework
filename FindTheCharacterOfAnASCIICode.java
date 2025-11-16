
package find.the.character.of.an.ascii.code;
import java.util.Scanner;
public class FindTheCharacterOfAnASCIICode {

    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the unicode");
  int unicode=input.nextInt();
  char charecter=(char)(unicode);
  System.out.println("char is" +   charecter);
    }
    
}
