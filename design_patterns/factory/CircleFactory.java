package design_patterns.factory;

public class CircleFactory extends ShapeFactory {
    Shape circle= new CircleShape();

    @Override
    public Shape createShape(){
        return circle;
    }
}
