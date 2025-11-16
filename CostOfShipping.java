
package cost.of.shipping;
import java.util.Scanner;
public class CostOfShipping {

public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("enter the weight of the package in pound");
     int W=input.nextInt();
     if(W>0 && W<=1){
         System.out.println("3.5$");
     }
     else if(W>1&&W<=3){
         System.out.println("5.5$");
         }
    else if(W>3&&W<=10){
         System.out.println("8.5");
     }
    else if(W>10&&W<=20){
         System.out.println("10.5");
       }
    else if(W<=0){
    
    System.out.println("invalid input");
    }
    else if(W>20){
        System.out.println("The package connot be shipped");
    }
     
    }
    
}
