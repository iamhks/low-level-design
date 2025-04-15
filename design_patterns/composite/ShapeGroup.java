package design_patterns.composite;

import java.util.List;

public class ShapeGroup implements Shape{
    private String groupName;
    private List<Shape> childs;

    public ShapeGroup(String name){
        this.groupName=name;
    }

    public void addChild(Shape child){
        childs.add(child);
    }

    public void removeChild(Shape child){
        childs.remove(child);
    }

    public void draw(){
        System.out.println("Drawing the entire group: "+ groupName);
        for(Shape child: childs){
            child.draw();
        }
    }
}
