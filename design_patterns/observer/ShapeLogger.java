package design_patterns.observer;

public class ShapeLogger implements ShapeObserver{
    @Override
    public void shapeUpdated(String shapeName){
        System.out.println("Logging the updated shape");
    }
}
