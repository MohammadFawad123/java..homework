
package swap.two.number;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int a = 2;
        int b= 3;
        System.out.println(+a+",b= " +b);
      a= a+b;
      b=a-b;
      a=a-b;
      System.out.println(+a+ ",b=" +b);
    }
    
}
