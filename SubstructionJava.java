
package substruction.java;
import java.util.Scanner;
public class SubstructionJava {

public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int number1 =(int)(Math.random()*100);
   int number2 =(int)(Math.random()*100);
   System.out.println("The result is " + number1 + "-" + number2 + "=" + "?" );
   int answer = input.nextInt();
   if(number1<number2)
   if(answer==number1-number2)
    System.out.println("correct");
   
   else
       System.out.println("Wrong");
   }
   
    }
    

