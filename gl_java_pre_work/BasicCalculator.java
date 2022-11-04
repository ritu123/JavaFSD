import java.util.Scanner;
class BasicCalculator{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");

        int num1 = input.nextInt();

        System.out.println("Enter second Number");

        int num2 = input.nextInt();

        System.out.println("Enter option 1. ADD 2.Susbract 3.Multiplication 4.Division");

        int option = input.nextInt();

        switch(option) {

            case 1: 
               System.out.println(num1 + num2);
               break;
            case 2: 
               System.out.println(num1 - num2);
               break;
            case 3: 
                System.out.println(num1 * num2);
                break;
            case 4: 
                System.out.println(num1/num2);
                break;
            default :
                System.out.println("Please select proper option");


        }



    }
}