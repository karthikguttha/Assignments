package Assignments;
import java.util.Scanner;

public class conditioanlstmtQ4 {
    public static void main(String[] args) {
        Scanner fon = new Scanner(System.in);
        System.out.println("Enter number");
        int num = fon.nextInt();
        long factorial = 1;

        if(num<0)
        {
            System.out.println("Number cannot be less than 0 as factorial is not defined for nmegative numbers");
        }
        for(int i = 1 ; i <= num ; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
