package SS3;

public class BooleanMethodTest {
    public static boolean isOdd(int number) {
        if (number % 2 == 1) { return true;
        } else { return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));
        System.out.println(isOdd(-5));
    }

}
