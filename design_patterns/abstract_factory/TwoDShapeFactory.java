package design_patterns.abstract_factory;

public class TwoDShapeFactory extends ShapeFactory{
    public Shape createShape1(){
        return new CircleShape();
    }

    public Shape createShape2(){
        return new RectangleShape();
    }
}
