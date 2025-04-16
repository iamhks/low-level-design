package design_patterns.state;

public class IdleState implements ShapeState{
    @Override
    public void performAction(Shape shape){
        System.out.println(shape.getName() + " is in idle state");
    }
}
