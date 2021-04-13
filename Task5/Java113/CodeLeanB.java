package Java113;
import Java113.CodeLeanA;
public class CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanA().methodPublic();;
        new CodeLeanA().methodProtected();
        new CodeLeanA().methodDefault();
    }

    public void methodPublic(){
    }

    public void methodProtected(){
    }

    void methodDefault(){
    }

    private void methodPrivate() {
    }
}
