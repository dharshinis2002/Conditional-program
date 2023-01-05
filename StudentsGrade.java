import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
double avg;
String studentgrade;

        System.out.println("enter your quarterly mark");
        int q=in.nextInt();

        System.out.println("enter your halfyearly mark");
        int h= in.nextInt();

        System.out.println("enter your final mark");
        int f=in.nextInt();

        avg=(q+h+f)/3;
        int mark;
        if(avg<=90){
            System.out.println("A");
        } else if (avg>70||avg<90) {
            System.out.println("B");

        } else if (avg<50||avg<70) {
            System.out.println("C");

        }else if(avg<50){
            System.out.println("D");
        }else{
            System.out.println("invalid mark");
        }
        System.out.println("your grade is :"+avg);

    }
}
