package design_patterns.observer;

public interface ShapeSubject {
    public void addObservers(ShapeObserver observer);
    public void removeObservers(ShapeObserver observer);
    public void notifyAllObservers(String shapeName);
}
