package design_patterns.decorator;

public class ShadowDecorator extends ShapeDecorator{
    public ShadowDecorator(Shape shape){
        super(shape);
    }

    private void setShadow(){
        System.out.println("Adding Shadow");
    }

    @Override
    public void draw(){
        decoratedShape.draw();;
        setShadow();
    }
}
