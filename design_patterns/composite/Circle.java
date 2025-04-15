package design_patterns.composite;

public class Circle implements Shape{
    String name;

    public Circle(String name){
        this.name= name;
    }

    @Override
    public void draw(){
        System.out.println("Drawing circle: "+ name);
    }
}
