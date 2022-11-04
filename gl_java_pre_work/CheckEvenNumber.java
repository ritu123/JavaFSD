import java.util.Scanner;
class CheckEvenNumber{
    public static void main(String[] args){
        //declaration
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number");

        int x = in.nextInt();
    
       //check given number is even or not;
       int  y = x%2;
       String result = (y == 0) ? "Given number is even" : "Given number is Odd";
       System.out.println(result);

       if(y==0) {
          System.out.println("Number is even");
       } else {
          System.out.println("Number is odd");
       }
    }
}