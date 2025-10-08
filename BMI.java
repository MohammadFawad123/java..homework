
     package bmi;
     import java.util.Scanner;
      public class BMI {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height");
        double height = input.nextDouble();
        System.out.println("Enter the weight");
        double weight = input.nextDouble();
         final double KILOGRAMS_PER_POUND=0.45359237;
         final double METERS_PER_INCH=0.0254;
         double weightInKilograms=weight*KILOGRAMS_PER_POUND;
         double heightInMeters=height*METERS_PER_INCH;
        double BMI = weightInKilograms/heightInMeters*heightInMeters;
        if(BMI<18.5)
            System.out.println("you are underweight");
         if(BMI>=18.5 && BMI<25)
            System.out.println("you are normal");
         if (BMI>=25 &&BMI<30)
            System.out.println("you are overweight");
        if(BMI>=30)
            System.out.println("you are obese");
        
       
        }   
}
