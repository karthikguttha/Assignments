package Assignments;

class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}
public class oopsQ3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }

}

