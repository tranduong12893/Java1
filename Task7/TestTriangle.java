package SS6.Task7;

public class TestTriangle {
    public static void main(String[] args) {

        point p1 = new point(2,3);
        point p2 = new point(3,4);
        point p3 = new point(5,4);
        Triangle t1 = new Triangle(p1,p2,p3);
            if(((t1.getAb()+t1.getBc())>t1.getAc())&&((t1.getAb()+t1.getAc())>t1.getBc())&&((t1.getAc()+t1.getBc())>t1.getAb())){
                System.out.println("A"+p1);
                System.out.println("B"+p2);
                System.out.println("c"+p3);
                System.out.println("Perimeter: "+t1.getPerimeter());
            }else {
                System.out.println("Is not Triangle!");
                System.out.println("Please try again!");
            }
    }
}
