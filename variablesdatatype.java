package Assignments;

import java.util.Scanner;

public class variablesdatatype {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.println("Enter first Number" );
        int A = sc.nextInt();
        System.out.println("Enter second Number" );
        int B = sc.nextInt();
        System.out.println("Enter third Number" );
        int C = sc.nextInt();

        double avg = (A+B+C)/3.0;
        System.out.println("Average" +avg);
    }

}
