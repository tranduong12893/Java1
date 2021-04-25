package SS8;

public class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape:" +
                "\ncolor= " + color ;
    }

    public double getArea(){
        System.out.println("No Area!");
        return 0;
    }

}
