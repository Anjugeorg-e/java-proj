package rectangle;

public class Rectangle {
    private float length;
    private float width;

    Rectangle(){
        length = 12;
        width = 13;
    }

    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){
        return this.length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public void setHeight(float length){
        this.length = length;
    }
    public double getArea(){
        return  length * width;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    
}
