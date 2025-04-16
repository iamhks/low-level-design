package design_patterns.commandd;

public class DrawCircleCommand implements Command{
    private DrawingCanvas canvas;

    public DrawCircleCommand(DrawingCanvas canvas){
        this.canvas=canvas;
    }

    @Override
    public void execute(){
        canvas.drawCircle();
    }
}
