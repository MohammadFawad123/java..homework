
package add.three.number;
import java.util.Scanner;
public class AddThreeNumber {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int num1=(int)(Math.random()*1000);
       int num2=(int)(Math.random()*1000);
       int num3=(int)(Math.random()*1000);
       System.out.println("The sum is"+num1+"+"+num2+"+"+num3+"?");
       int answer = input.nextInt();
       if(num1+num2+num3==answer){
           System.out.println("answer is correct");
       }
       else{
           System.out.println("answer is wrong");
           System.out.println(+num1+"+"+num2+"+"+num3+"="+(+num1 +num2+num3));
       }
       }
    }
    

