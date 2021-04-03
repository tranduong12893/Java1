package SS2;

public class tamgiac {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for (int j=5;((j>i)||(j==i));j--){
                System.out.print(" ");
            }
            for (int k=1;((k<(2*i)-1))||(k==(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
