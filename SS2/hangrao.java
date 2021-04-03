package SS2;

public class hangrao {
    public static void main(String[] args) {
        for (int b=0;b<4;b++){
            for(int a=4;((a<63)||(a==63));a++){
                System.out.print(a%4==0?"|":"-");
            }
            System.out.println();
        }

    }
}
