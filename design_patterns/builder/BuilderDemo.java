package design_patterns.builder;

import design_patterns.builder.ShapeSpecifications.Builder;

public class BuilderDemo {
    public static void main(String args[]){
        ShapeSpecifications circle=new Builder("Circle")
                                        .color("black")
                                        .isFilled(true)
                                        .borderWidth(2)
                                        .build();
        circle.draw();
    }
}
