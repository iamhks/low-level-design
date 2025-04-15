package design_patterns.composite;

public class CompositeDemo {
    public static void main(String[] args){
        Circle c1= new Circle("C1");
        Circle c2= new Circle("C2");
        
        Rectangle r1= new Rectangle("R1");

        ShapeGroup g1= new ShapeGroup("G1");
        ShapeGroup g2= new ShapeGroup("G2");

        g1.addChild(c1);
        g1.addChild(r1);
        g1.addChild(c2);
        g1.addChild(g2);

        g1.draw();
    }
}
