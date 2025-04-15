package design_patterns.facade;

public class FacadeShape {
    Circle circle;
    Rectangle rectangle;

    public FacadeShape(){
        this.circle=new Circle();
        this.rectangle= new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawAllShapes(){
        circle.draw();
        rectangle.draw();
    }
}
