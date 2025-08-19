package Assignments;

class shape{
    void draw(){
        System.out.println("drawing a shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("drawing a square");
    }
}
public class oopsQ4{
    public static void main(String[] args) {
        shape s;

        s = new circle();
        s.draw();

        s = new square();
        s.draw();

    }
}

