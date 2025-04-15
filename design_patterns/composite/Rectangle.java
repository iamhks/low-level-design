package design_patterns.composite;

public class Rectangle implements Shape{
    String name;

    public Rectangle(String name){
        this.name= name;
    }

    @Override
    public void draw(){
        System.out.println("Drawing rectangle: "+ name);
    }
}
