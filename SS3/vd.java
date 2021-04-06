package SS3;

import java.util.Locale;

public class vd {
    public static void main(String[] args) {
        //9.1
        char c1='O';
        char c2='A';
        char c3;

        System.out.println((int)c1);
        System.out.println((int)c2);
        c3=97;
        System.out.println(c3);
        System.out.println((char) 97);

        c3=(char)(c1+c2);
        System.out.println(c3);
        System.out.println(c1+c2);
        System.out.println((char)(c1+c2));

        c3=(char)(c1+5);
        System.out.println(c3);
        System.out.println(c1+5);

        for(int codeNum='a';codeNum<='z';++codeNum){
            System.out.println((char)codeNum+":"+codeNum);
        }
        char c4='0';
        c4+=5;
        System.out.println(c4);
        for (char c = '0';c<='9';++c){
            System.out.println(c);
        }
        //9.2
        char hexChar ='a';
        int dec;
        if(hexChar>='0'&&hexChar<='9'){
            dec=hexChar-'0';
        }else if (hexChar>='A' && hexChar<='F'){
            dec=hexChar-'A' +10;
        }else  if (hexChar>='a' && hexChar<='f'){
            dec = hexChar -'a'+ 10;
        }else {
            dec=-1;
            System.out.println("Invalid hex char");
        }
        System.out.println(hexChar+":"+dec);

    //9.3
        String str ="Java is cool";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));

        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(anotherStr.equals(str));
        System.out.println(str.equalsIgnoreCase(anotherStr));

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0,3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.endsWith("cool!"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    //9.4
        String inStr="5566";
        int number = Integer.parseInt(inStr);

        String inStr1="55.66";
        float aFloat= Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");

        String msg = "Hello, world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
        }
        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr);
        boolean valid = Boolean.parseBoolean("false");
        //9.5
        String str1	= 123 +"";
        String str2	= 12.34+ "";
        String str3	= 'c' + "";
        String str4	= true + ";";
        String str5	=	String.valueOf(12345);
        String str6	=	String.valueOf(true);
        String str7	=	String.valueOf(55.66);

        String str8	=	Integer.toString(1234);
        String str9	=	Double.toString(1.23);
        String str1O = Character.toString('z');
        System.out.printf("Hi, %d, %.1f%n", 11, 22.22);
        String str11 = String.format("%.1f", 1.234);
    }
}
