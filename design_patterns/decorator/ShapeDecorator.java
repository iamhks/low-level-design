package design_patterns.decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape=shape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
