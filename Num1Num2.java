
package num1.num2;
import java.util.Scanner;
public class Num1Num2 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
         int correctResult=number1+number2;
        int count =0;
        while(count<=10){
         System.out.println("what is " + number1 + "+" + number2 + "=?");
        int userResult = input.nextInt();
        if(userResult==correctResult){
            System.out.println("The answer is correct");
            break;
        } else {
            System.out.println("your answer is not");
            count++;
        }
            
            
        
        }    
       
    }
    
}
