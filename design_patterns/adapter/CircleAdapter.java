package design_patterns.adapter;

public class CircleAdapter implements Shape{
    private int x, y, radius;
    private LegacyCircleDrawer legacyCircle;

    public CircleAdapter(int x, int y, int radius){
        this.legacyCircle=new LegacyCircleDrawer();
        this.radius=radius;
        this.x=x;
        this.y=y;
    }


    @Override
    public void draw(){
        legacyCircle.draw(radius, x, y);
    }
}
