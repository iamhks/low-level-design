package design_patterns.facade;

public class FacadeDemo {
    public static void main(){
        FacadeShape shape= new FacadeShape();

        shape.drawCircle();

        shape.drawAllShapes();
    }
}
