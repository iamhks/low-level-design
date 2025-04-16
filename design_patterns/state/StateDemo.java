package design_patterns.state;

public class StateDemo {
    public static void main(String[] args) {
        Shape circle = new Shape("Circle");
        Shape rectangle = new Shape("Rectangle");

        circle.performAction(); // Idle by default

        circle.setState(new RunningState());
        circle.performAction(); // Drawing circle

        circle.setState(new FilledState());
        circle.performAction(); // Filled circle

        rectangle.setState(new RunningState());
        rectangle.performAction(); // Drawing rectangle
    }
}
