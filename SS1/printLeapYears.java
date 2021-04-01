package SS1;

import java.time.Year;

public class printLeapYears {
    public static void main(String[] args) {
        int lowerYear = 999, upperYear = 2010;
        int count=0;
        int year=lowerYear;
        while (year<=upperYear){
            if (((year % 4 == 0) && (year % 100 != 0)) ||
                    (year % 400 == 0)){
                System.out.println("Leap Year is:"+ year);
                ++count;
            }
            ++year;
        }
        System.out.println("Sum Leap Year from "+ lowerYear + " to " + upperYear+ " is: " + count );
    }
}
