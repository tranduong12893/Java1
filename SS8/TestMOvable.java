package SS8;

public class TestMOvable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(3,4);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
    }
}
