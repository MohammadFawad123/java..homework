
package subtraction.ab.cd;
import java.util.Scanner;

public class SubtractionAbCd {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the A");
       int A= input.nextInt();
        System.out.println("Enter the B");
       int B= input.nextInt();
        System.out.println("Enter the C ");
       int C= input.nextInt();
        System.out.println("Enter the D");
       int D= input.nextInt();
        System.out.println("Enter the E");
       int E= input.nextInt();
       System.out.println("Enter the F");
       int F= input.nextInt();
       System.out.println("the result is"+A*D+"-"+C*B);
      if(A*D-C*B==0){
          System.out.println("the equation has  no Salution");
        }
      else {
          System.out.println("the equation has Salution"+A*D+"-"+C*B+"="+(+A*D-C*B));
      }
           
       
       
    }
    
}
