public class Leap_year {

     public static void main (String[]args) {
          int year = 2020;
          boolean leap = false;
          if (year % 4 == 0 ||year % 400 == 0)
               leap = true;
          else
               leap = false;

          if (leap)


               System.out.println("Year " + year + " is a leap year.");
          else

                  System.out.println("Year " + year + " is not a leap year.");
     }
     }


