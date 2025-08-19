package Assignments;

import java.util.Scanner;

public class variablesanddatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener the cost of 3 items");

        System.out.println("Enter the cost of pencil");
        float pencil = sc.nextFloat();

        System.out.println("Ener the cost of pen");
        float pen = sc.nextFloat();

        System.out.println("Ener the cost of eraser");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("The total cost is Without GST: " + total);

        float total2 = total * 0.18f;

        System.out.println("The total cost is With GST: " + (total + total2));
    }
}
