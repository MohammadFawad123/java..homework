    package random.month;
    import java.util.Scanner;
    public class RandomMonth {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       int month=(int)(Math.random()*12+1);
       switch(month){
           case 1:
               System.out.println("january");
               break;
           case 2:
                System.out.println("February");
                break;
           case 3:
                System.out.println("March");
                break;
           case 4:
                System.out.println("April");
                break;
           case 5:
                System.out.println("May");
                break;
           case 6:
                System.out.println("June");
                break;
           case 7: 
                System.out.println("July");
                break;
           case 8: 
                System.out.println("Augest");
                break;
           case 9: 
                System.out.println("september");
                break;
           case 10: 
                System.out.println("october");
                break;
           case 11: 
                System.out.println("nevember");
                break;
           case 12: 
                System.out.println("December");
                break;
           default:
               System.out.println("not monthyear");
                
           
       }
    }
    
}
