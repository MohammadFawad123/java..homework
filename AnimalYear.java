
package animal.year;
import java.util.Scanner;
public class AnimalYear {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the year");
    int year = input.nextInt();
    int outputyear = year%12;
    switch (outputyear){
        case 0:
            System.out.println("the year is monkey year");
            break;
        case 1:
            System.out.println("the year is rooser year");
            break;
        case 2: 
        System.out.println("the year is dog year");
        break;
        case 3:
        System.out.println("the year is pig year");
        break;
        case 4:
            System.out.println("the year is rat year");
            break;
            case 5:
            System.out.println("the year is ox year");
            break;
            case 6:
            System.out.println("the year is tiger year");
            break;
            case 7:
            System.out.println("the year is Rabbit year");
            break;
            case 8:
            System.out.println("the year is Dragon year");
            break;
            case 9:
            System.out.println("the year is snake year");
            break;
            case 10:
            System.out.println("the year is horse year");
            break;
            case 11:
            System.out.println("the year is sheep year");
            break;
        
    }
    
    }
    
}
