package design_patterns.abstract_factory;

public class RectangleShape implements Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
