package design_patterns.strategy;

public class LineRenderStrategy implements RenderStrategy{
    @Override
    public void render(){
        System.out.println("Rendering using line drawing");
    }
}
