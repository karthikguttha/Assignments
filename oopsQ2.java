package Assignments;

class Student {   // not public, helper class
    public String name;
}

public class oopsQ2 {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "Karthik";
        System.out.println(sc.name);
    }
}

