package SS3;

public class VarargsTest {
    public static void doSomething(String... strs) {
        System.out.print("Arguments are: ");
        for (String str : strs) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }
    public static void doSomething(String si, String s2) {
        System.out.println("Overloaded version with 2 args: " + si + ", " + s2); }

    public static void main(String... args) {
        doSomething("Hello", "world", "again", "and", "again");
        doSomething("Hello", "world");
        String[] strs = {"apple", "orange"};
        doSomething(strs);
    }

}
