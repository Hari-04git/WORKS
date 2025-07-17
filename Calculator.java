import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2, num3));
        System.out.println("Subtraction: " + subtract(num1, num2,num3));
        System.out.println("Multiplication: " + multiply(num1, num2,num3));
        System.out.println("Division: " + divide(num1, num2));

        scanner.close();
    }

    public static int add(int num1, int num2 ,int num3) {
        return num1 + num2 + num3 ;
    }

    public static int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
    public static int multiply(int num1, int num2 , int num3) {
        return num1 * num2* num3;
    }

    public static int divide(int num1, int num2) {
      if(num2==0){
          System.out.println( " ");
         return 0;
    }
         else{
               return (num1%num2);
        }
    }
}

