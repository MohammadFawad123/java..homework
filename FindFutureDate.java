
package find.future.date;
import  java.util.Scanner;
public class FindFutureDate {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for today:");
        int number = input.nextInt();
        if(number %7 == 0 )System.out.println("Today is Sunday.");
        if(number %7 == 1 )System.out.println("Today is Monday.");
        if(number %7 == 2 )System.out.println("Today is Teuse day.");
        if(number %7 == 3 )System.out.println("Today is Wends day.");
        if(number %7 == 4 )System.out.println("Today is Thurse day.");
        if(number %7 == 5 )System.out.println("Today is Friday.");
        if(number %7 == 6 )System.out.println("Today is Satar day.");
        System.out.println("Enter a number for the next day:");
        int nextNum = input.nextInt();
        
        if(nextNum %7 == 0 )System.out.println(" the next day is Sunday.");
        if(nextNum %7 == 1 )System.out.println("the next day is Monday.");
        if(nextNum %7 == 2 )System.out.println("the next day is Teuse day.");
        if(nextNum %7 == 3 )System.out.println("the next day is Wends day.");
        if(nextNum %7 == 4 )System.out.println("the next day is Thurse day.");
        if(nextNum %7 == 5 )System.out.println("the next day is Friday.");
        if(nextNum %7 == 6 )System.out.println("the next day is Satar day.");    
    }
    
}
