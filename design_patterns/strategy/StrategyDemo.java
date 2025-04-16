package design_patterns.strategy;

public class StrategyDemo {
    public static void main(String[] args){
        Shape circle= new Shape("Circle");
        Shape rectangle= new Shape("Rectangle");

        circle.setRenderStrategy(new LineRenderStrategy());
        rectangle.setRenderStrategy(new ShadowRenderStrategy());

        circle.render();
        rectangle.render();
    }
}
