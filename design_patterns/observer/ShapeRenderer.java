package design_patterns.observer;

public class ShapeRenderer implements ShapeObserver{
    @Override
    public void shapeUpdated(String shapeName){
        System.out.println("Re-rendering the updated shape");
    }
}
