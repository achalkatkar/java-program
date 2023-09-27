import java.util.Scanner;   // import the scanner class

public class addition {

    public static void main(String [] args){
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);    // create a scanner onject
        System.out.println("Enter the first number"); 
        x = myObj.nextInt();               // read user input

        System.out.println("Enter the second number");
        y = myObj.nextInt();

        sum = x + y;         // calculate the sum of x + y 
        System.out.println("Addition of two number :"+sum);   // print the sum 



    }
    
}
