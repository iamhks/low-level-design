package design_patterns.factory;

public class RectangleFactory extends ShapeFactory{
    Shape rectangle=new RectangleShape();

    @Override
    public Shape createShape(){
        return rectangle;
    }
}
