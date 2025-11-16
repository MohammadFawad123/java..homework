
package palindrome.integer;
import java.util.Scanner;
public class PalindromeInteger {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the digit 1");
   int digit1 = input.nextInt();
    System.out.println("Enter the digit 2");
   int digit2 = input.nextInt();
    System.out.println("Enter the digit 3");
   int digit3 = input.nextInt();
   if(digit3==digit1 && digit2==digit2){
       System.out.println("is a palindrome");
   }
   else{
       System.out.println("is not palindrome");
   }
    }
    
}
