package design_patterns.factory;

public class RectangleShape implements Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
