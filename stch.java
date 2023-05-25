import java.util.Scanner;

public class stch {
   public static void main(String[] args) {
      System.out.print("Enter Two Integers:");
      try (Scanner sc = new Scanner(System.in)) {
         double a= sc.nextDouble();
         double b= sc.nextDouble();
         System.out.println("Enter an Operator: (+,-,*,/,%)");
         char op=sc.next().charAt(0);
         double result;
         switch (op) {
            case '+': 
               result = a+b;
               System.out.println("the addition of "+a+ " and "+b+" = "+result); 
               break;
            case '-':
               result=a-b;
               System.out.println("the subtraction of "+a+ " and "+b+" = "+result);
               break;
         
            case '*':
               result=a*b;
               System.out.println("the multiplication of "+a+  " and "+b+" = "+result);
               break;
         
            case '/':
               result=a/b;
               System.out.println("the divition of "+a+  " and "+b+" = "+result);
               break;
         
            case '%':
               result=a%b;
               System.out.println("the modulus of "+a+  " and "+b+" = "+result);
               break;
          
            default: 
               System.out.println("You've entered an invalid operator!");
               break;
         
         }
      }
   
         
   }

}
