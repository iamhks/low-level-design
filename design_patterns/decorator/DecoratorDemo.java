package design_patterns.decorator;

public class DecoratorDemo {
    public static void main(String args[]){
        Shape circle= new Circle();
        Shape borderCircle= new BorderDecorator(circle);
        Shape shadowCircle= new ShadowDecorator(circle);
        
        circle.draw();
        borderCircle.draw();
        shadowCircle.draw();
    }
}
