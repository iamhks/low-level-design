package design_patterns.singleton;

public class ShapeCreator {
    public static ShapeCreator instance;
    
    public synchronized ShapeCreator getInstance(){
        if(instance==null){
            return new ShapeCreator();
        }
        return instance;
    }
}