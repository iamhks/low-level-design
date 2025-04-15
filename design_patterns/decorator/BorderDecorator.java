package design_patterns.decorator;

public class BorderDecorator extends ShapeDecorator{
    public BorderDecorator(Shape shape){
        super(shape);
    }

    private void setBorder(){
        System.out.println("Adding border");
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBorder();
    }
}
