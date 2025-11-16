
package counting.number;
import java.util.Scanner;
public class CountingNumber {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        System.out.println("ENter integer number enter 0 to exit");
        int positiveNum = 0;
        int negitiveNum = 0;
        int sum = 0;
        int count = 0;
        
        
        
        while(true){
            int num = input.nextInt();
            
            if (num == 0){
                break;
            }
            
            sum+=num;
            count++;
            
            if(num > 0){
                positiveNum++;
            }
            else
                negitiveNum++;
            
            
            
        }
        
        double avvrege = (double) (sum/count);
        
        
        System.out.println("Positive number is " + positiveNum);
        System.out.println("NegitiveNumber is " + negitiveNum);
        System.out.println("Total is " +sum);
        System.out.println("Count is " + count);
        System.out.println("Avvrege is " + avvrege);
        
    }
    
}
