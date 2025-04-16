package design_patterns.template_method;

public class TemplateDemo {
    public static void main(String[] args){
        ShapeTemplate circle= new CircleShape();
        ShapeTemplate rectangle= new RectangleShape();

        rectangle.drawShape();
        circle.drawShape();
    }
}
