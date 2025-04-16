package design_patterns.template_method;

public abstract class ShapeTemplate {
    
    public final void drawShape(){
        startDrawing();
        draw();
        if(shouldFill()){
            fill();
        }
        endDrawing();
    }

    private void startDrawing(){
        System.out.println("Started drawing the shape");
    }

    protected abstract void draw();

    protected void fill(){
        System.out.println("Filling the object with default color");
    }

    protected boolean shouldFill(){
        return true;
    }

    private void endDrawing(){
        System.out.println("Completed drawing the shape");
    }
}
