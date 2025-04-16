package design_patterns.state;

public class Shape {
    private String name;
    private ShapeState state;

    public Shape(String name){
        this.name=name;
        this.state=new IdleState();
    }

    public String getName() {
        return name;
    }

    public void setState(ShapeState state) {
        this.state = state;
    }

    public void performAction(){
        state.performAction(this);
    }
  
}
