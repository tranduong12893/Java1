package SS2;

public class donghocat {
    public static void main(String[] args) {
        System.out.println("+------+");
        for(int a=1;a<4;a++){
            for(int b=0;b<8;b++) {
                    if ((a == 1) && ((b == 0) || (b == 7))) {
                        System.out.print("|");
                    } else if ((a == 1) && (b == 1)) {
                        System.out.print("\\");
                    } else if ((a == 1) && (b == 6)) {
                        System.out.print("/");
                    } else if(a==1){
                        System.out.print(".");
                    }
                }
            if(a==1){System.out.print("\n");}
            for(int b=0;b<8;b++){
                    if ((a==2)&&((b == 0) || (b == 7))){
                        System.out.print("|");
                    }else if ((a==2)&&(b==2)){
                        System.out.print("\\");
                    }else if ((a==2)&&(b==5)){
                        System.out.print("/");
                    }else if((a==2)&&((b==1)||(b==6))) {
                        System.out.print(" ");
                    }else if(a==2){
                        System.out.print(".");
                    }
               }
            if(a==2){System.out.print("\n");}
            for(int b=0;b<8;b++){
                if ((a==3)&&((b == 0) || (b == 7))){
                    System.out.print("|");
                }else if ((a==3)&&(b==3)){
                    System.out.print("\\");
                }else if ((a==3)&&(b==4)){
                    System.out.print("/");
                }else if(a==3) {
                    System.out.print(" ");
                }
            }
            if(a==3){System.out.print("\n");}
        }
        for(int a=4;a>1;a--){
            for(int b=0;b<8;b++){
                if ((a==4)&&((b == 0) || (b == 7))){
                    System.out.print("|");
                }else if ((a==4)&&(b==4)){
                    System.out.print("\\");
                }else if ((a==4)&&(b==3)){
                    System.out.print("/");
                }else if(a==4) {
                    System.out.print(" ");
                }
            }
            if(a==4){System.out.print("\n");}
            for(int b=0;b<8;b++){
                if ((a==3)&&((b == 0) || (b == 7))){
                    System.out.print("|");
                }else if ((a==3)&&(b==5)){
                    System.out.print("\\");
                }else if ((a==3)&&(b==2)){
                    System.out.print("/");
                }else if((a==3)&&((b==1)||(b==6))) {
                    System.out.print(" ");
                }else if(a==3){
                    System.out.print(".");
                }
            }
            if(a==3){System.out.print("\n");}
            for(int b=0;b<8;b++) {
                if ((a == 2) && ((b == 0) || (b == 7))) {
                    System.out.print("|");
                } else if ((a ==2) && (b == 6)) {
                    System.out.print("\\");
                } else if ((a == 2) && (b == 1)) {
                    System.out.print("/");
                } else if(a==2){
                    System.out.print(".");
                }
            }
            if(a==2){System.out.print("\n");}
        }
        System.out.println("+------+");
    }
}
//(b>1)||(b<5)
//System.out.print(((a==0)&&((b==0)||(b==7)))?"|":(((a==0)&&(b==1))?"\\":(((a==0)&&(b==6))?"/":".")));
//System.out.print(((a==1)&&((b==0)||(b==7)))?"|":(((a==1)&&(b==3))?"\\":(((a==1)&&(b==5))?"/":((a==1)&&((b==2)||(b==6)))?" ":".")));