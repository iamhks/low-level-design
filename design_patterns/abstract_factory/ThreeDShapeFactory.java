package design_patterns.abstract_factory;

public class ThreeDShapeFactory extends ShapeFactory{
    public Shape createShape1(){
        return new SphereShape();
    }

    public Shape createShape2(){
        return new CubeShape();
    }
}
