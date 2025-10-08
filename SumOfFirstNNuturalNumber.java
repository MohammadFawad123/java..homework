
package sum.of.first.n.nutural.number;
import java.util.Scanner;
public class SumOfFirstNNuturalNumber {
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    System.out.println("Enter the n");
    int n = input.nextInt();
    int number = n*(n+1)/2;
    System.out.println("result"+ number);
    
 
    }
    
}
