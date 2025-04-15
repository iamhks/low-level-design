package design_patterns.builder;

public class ShapeSpecifications {
    private String type;
    private String color;
    private boolean isFilled;
    private int borderWidth;

    public ShapeSpecifications(Builder builder) {
        this.type = builder.type;
        this.color = builder.color;
        this.isFilled = builder.isFilled;
        this.borderWidth = builder.borderWidth;
    }

    void draw(){
        System.out.println("Drawing a "+type+" with color "+color+" whose border width is "+borderWidth+ (isFilled?" \n It is also filled with color":""));
    }

    public static class Builder{
        private String type;
        private String color="black";
        private boolean isFilled=true;
        private int borderWidth=1;

        public Builder(String type){
            this.type=type;
        }

        public Builder color(String color){
            this.color=color;
            return this;
        }

        public Builder isFilled(boolean isFilled){
            this.isFilled=isFilled;
            return this;
        }

        public Builder borderWidth(Integer borderWidth){
            this.borderWidth=borderWidth;
            return this;
        }

        public ShapeSpecifications build(){
            return new ShapeSpecifications(this);
        }
    }
}
