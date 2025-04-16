package design_patterns.state;

public class RunningState implements ShapeState{
    @Override
    public void performAction(Shape shape){
        System.out.println(shape.getName() + " is in running state");
    }
}
