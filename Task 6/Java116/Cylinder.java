package Java116;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Constructed a Circle with Circle()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Constructed a Circle with Circle(Height)");
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Circle with Circle(Height; radius)");
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Circle with Circle(Height; radius,Color)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder";
    }
}
