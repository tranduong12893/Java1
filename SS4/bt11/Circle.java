package SS4.bt11;

public class Circle {
    private double radius;
    private  String color;
    
    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="red";
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public void setRadius(double newRadius){
        this.radius=newRadius;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "Circle[radius="+this.radius+"\ncolor="+this.color+"]";
    }


}
