package design_patterns.template_method;

public class RectangleShape extends ShapeTemplate{
    @Override
    protected void draw(){
        System.out.println("Rectangle shape is being drawn");
    }

    @Override
    protected boolean shouldFill(){
        return false;
    }
}
