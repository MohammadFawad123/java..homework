
package lottery.java;
import java.util.Scanner;
public class LotteryJava {

    public static void main(String[] args) {
        int lottery = (int)(Math.random()*100);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your lottery pick(Two digits: ");
    int guss = input.nextInt();
    int lotteryDigit1 = lottery/10;
    int lotteryDigit2 = lottery%10;
    int gussDigit1 = lottery/10;
    int gussDigit2 = lottery%10;
    System.out.println("the lottery number is " + lottery);
    if(guss==lottery)
        System.out.println("Exact match; you win 10000$");
    else if (gussDigit2==lotteryDigit1
            && gussDigit1==lotteryDigit2)
        System.out.println("match all Didit:you win3000$");
    else if (gussDigit1== lotteryDigit1
            || gussDigit1== lotteryDigit2
            || gussDigit2==lotteryDigit2
            || gussDigit2==lotteryDigit1
            ||gussDigit2==lotteryDigit2)
        System.out.println("match one digit:you win$1000");
    else
        System.out.println("no match");
    }
    
}
