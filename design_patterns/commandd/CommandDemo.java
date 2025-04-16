package design_patterns.commandd;

public class CommandDemo {
    public static void main(String[] args){
        DrawingCanvas canvas= new DrawingCanvas();
        Command circle=new DrawCircleCommand(canvas);
        Command rectangle= new DrawRectangleCommand(canvas);

        CommandStateManager manager= new CommandStateManager();

        manager.executeCommand(circle);
        manager.executeCommand(rectangle);
        manager.undoCommand();
    }
}
