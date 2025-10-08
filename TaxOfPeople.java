
package tax.of.people;
import java.util.Scanner;
public class TaxOfPeople {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Status;
        
        System.out.println("Enter the Status");
        Status = input.next();
        System.out.println("Enter the Salary");
        double Salary = input.nextDouble();
         double x = Salary*10/100;
        if("Single".equals(Status) && Salary>0 && Salary<=8350)
            System.out.println("the tax is" + x );
        double x1 = Salary*15/100; 
        if("Single".equals(Status)&& Salary>8351 && Salary<=33950)
            System.out.println("the tax is" + x1 );
         double x2 = Salary*25/100;
         if("Single".equals(Status)&& Salary>33951 && Salary<= 82250)
            System.out.println("the tax is" + x2 );  
         double x3 = Salary*28/100;
              if("Single".equals(Status)&& Salary>82251 && Salary<=171550)
            System.out.println("the tax is" + x3); 
              double x4 = Salary*33/100;
               if("Single".equals(Status)&& Salary>171551 && Salary<=372950)
            System.out.println("the tax is" + x4);
               double x5= Salary*35/100;
                if("Single".equals(Status)&& Salary>+372951)
            System.out.println("the tax is" + x5);
        
        double y = Salary*10/100;
        if("Married".equals(Status) && Salary>0 && Salary<=16700)
            System.out.println("the tax is" + y );
        double y1 = Salary*15/100; 
        if("Married".equals(Status)&& Salary>16701 && Salary<=67900)
            System.out.println("the tax is" + y1 );
         double y2= Salary*25/100;
         if("Married".equals(Status)&& Salary>67901 && Salary<=137050)
            System.out.println("the tax is" + y2 );  
         double y3 = Salary*28/100;
              if("Married".equals(Status)&& Salary>137051 && Salary<=208850)
            System.out.println("the tax is" + y3); 
              double y4 = Salary*33/100;
               if("Married".equals(Status)&& Salary>208851 && Salary<=372950)
            System.out.println("the tax is" + y4);
               double y5= Salary*35/100;
                if("Married".equals(Status)&& Salary>+372951)
            System.out.println("the tax is" + y5);
                
         double z = Salary*10/100;
          if("Separately".equals(Status) && Salary>0 && Salary<=8350)
            System.out.println("the tax is" + z );
        double z1 = Salary*15/100; 
        if(" Separately".equals(Status)&& Salary>8351 && Salary<=33950)
            System.out.println("the tax is" + z1 );
         double z2= Salary*25/100;
         if(" Separately".equals(Status)&& Salary>33951 && Salary<=68525)
            System.out.println("the tax is" + z2 );  
         double z3 = Salary*28/100;
              if("Separately".equals(Status)&& Salary>68526 && Salary<=104425)
            System.out.println("the tax is" + z3); 
              double z4 = Salary*33/100;
               if("Separately".equals(Status)&& Salary>104426 && Salary<=186475)
            System.out.println("the tax is" + z4);
               double z5= Salary*35/100;
                if(" Separately".equals(Status)&& Salary>+186476)
            System.out.println("the tax is" + z5);            
             
    double a = Salary*10/100;
        if(" Household".equals(Status) && Salary>0 && Salary<=11950)
            System.out.println("the tax is" + a );
        double a1 = Salary*15/100; 
        if("Household".equals(Status)&& Salary>11951 && Salary<=45500)
            System.out.println("the tax is" + a1 );
         double a2= Salary*25/100;
         if("Household".equals(Status)&& Salary>45501 && Salary<=117450)
            System.out.println("the tax is" + a2 );  
         double a3 = Salary*28/100;
              if("Household".equals(Status)&& Salary>117451 && Salary<=190200)
            System.out.println("the tax is" + a3); 
              double a4 = Salary*33/100;
               if("Household".equals(Status)&& Salary>190201 && Salary<=372950)
            System.out.println("the tax is" + a4);
               double a5= Salary*35/100;
                if("Household".equals(Status)&& Salary>+372951)
            System.out.println("the tax is" + a5);            
             
        
           
        
      
      
                                   
        }
        }
     
