package SS2;

public class donghocat {
    public static void main(String[] args) {
        System.out.println("+------+");
        for(int a=0;a<1;a++){
                for(int b=0;b<8;b++){
                    if ((a==0)&&((b==0)||b==7)){
                        System.out.print("|");
                    }else if ((a==0)&&(b==1)){
                        System.out.print("|\...");
                    }
            }
        }
        System.out.println("+------+");
    }
}
