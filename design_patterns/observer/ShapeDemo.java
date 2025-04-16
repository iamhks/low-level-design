package design_patterns.observer;

public class ShapeDemo {
    public static void main(String[] args){
        ShapeObserver logger=new ShapeLogger();
        ShapeObserver renderer= new ShapeRenderer();

        ShapeStateManager manager= new ShapeStateManager();

        manager.addObservers(logger);
        manager.addObservers(renderer);

        manager.updateShape("Circle");
    }
}
