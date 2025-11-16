
package check.sub.string;
import java.util.Scanner;
public class CheckSubString {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first String");
        String str1 = input.next();
        
        System.out.println("Enter the Secend String");
        String str2 = input.next();
        
        if (str1.contains(str2)){
            
            System.out.println("Str 2 is substing of str1 ");
        }
        
        else {
            System.out.println("Str2 is not substring of str1");
            
    }
    
}
