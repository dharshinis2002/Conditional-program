import java.util.Scanner;

public class Numberofdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the month");
        int month = in.nextInt();
        System.out.println("enter the year");
        int Year = in.nextInt();

        int Numberofdays=0;
        String monthofname="unknown";

        switch (month) {
            case 1:
                 monthofname = "january";
                Numberofdays = 31;
                break;
            case 2:
                monthofname= "febrary";
                if((Year%400==0)||(Year%4==0)&&(Year%100!=0)){
               Numberofdays =29;
                }
                else {
                    Numberofdays = 29;}
                break;
            case 3:
                monthofname = "march";
                Numberofdays = 31;
                break;

            case 4:
                monthofname = "april";
                Numberofdays = 30;
                break;
            case 5:
                monthofname = "may";
                Numberofdays = 31;
                break;
            case 6:
                monthofname = "june";
                Numberofdays = 31;
                break;
            case 7:
                monthofname = "july";
                Numberofdays = 30;
                break;

            case 8:
                monthofname = "august";
                Numberofdays = 31;
                break;
            case 9:
                monthofname = "september";
                Numberofdays = 30;
                break;
            case 10:
                monthofname = "october";
                Numberofdays = 31;
                break;
            case 11:
                monthofname = "november";
                Numberofdays = 30;
                break;
            case 12:
                monthofname = "december";
                Numberofdays = 31;


        } System.out.println(monthofname+ "has"+Numberofdays +"days");

    }

    }
