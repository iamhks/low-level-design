package design_patterns.strategy;

public class Shape {
    private String name;
    private RenderStrategy strategy;

    public Shape(String name){
        this.name=name;
    }

    public void setRenderStrategy(RenderStrategy strategy){
        this.strategy=strategy;
    }

    public void render(){
        if(strategy!=null){
            strategy.render();
        } else {
            System.out.println("No strategy set");
        }
    }
}
