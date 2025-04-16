package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ShapeStateManager implements ShapeSubject{
    List<ShapeObserver> observers= new ArrayList<>();

    @Override
    public void addObservers(ShapeObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObservers(ShapeObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String shapeName){
        for(ShapeObserver observer: observers){
            observer.shapeUpdated(shapeName);
        }
    }

    public void updateShape(String shapeName){
        System.out.println("Shape updated");
        notifyAllObservers(shapeName);
    }
}
