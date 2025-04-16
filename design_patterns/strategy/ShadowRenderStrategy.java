package design_patterns.strategy;

public class ShadowRenderStrategy implements RenderStrategy{
    @Override
    public void render(){
        System.out.println("Rendering with shadows");
    }
}
