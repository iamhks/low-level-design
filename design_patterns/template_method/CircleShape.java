package design_patterns.template_method;

public class CircleShape extends ShapeTemplate{
    @Override
    protected void draw(){
        System.out.println("Circle shape is being drawn");
    }

    @Override
    protected void fill(){
        System.out.println("Filling the shape with red color");
    }
}
