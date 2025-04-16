package design_patterns.commandd;

public class DrawRectangleCommand implements Command{
    private DrawingCanvas canvas;

    public DrawRectangleCommand(DrawingCanvas canvas){
        this.canvas=canvas;
    }

    @Override
    public void execute(){
        canvas.drawRectangle();
    }
}
