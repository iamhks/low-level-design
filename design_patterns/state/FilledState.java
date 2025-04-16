package design_patterns.state;

public class FilledState implements ShapeState{
    @Override
    public void performAction(Shape shape){
        System.out.println(shape.getName() + " is in filled state");
    }
}
