/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heads.or.tails;
import java.util.Scanner;
/**
 *
 * @author janna
 */
public class HeadsOrTails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
                    
    int coin = (int)(Math.random() * 2); 
    System.out.print("Guess heads (0) or tails (1): ");
        int guess = input.nextInt();
     
        if (guess != 0 && guess != 1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Coin is " + (coin == 0 ? "heads" : "tails"));
            if (guess == coin) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Incorrect guess.");
    }
    
}
