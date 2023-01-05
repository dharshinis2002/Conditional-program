import java.util.Scanner;

public  class Increaseordecrease {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the 1st num");
        int a =in.nextInt();

        System.out.println("enter the 2nd num");
        int b=in.nextInt();

        System.out.println("enter the 3rd num");
        int c=in.nextInt();

        if(a<b&&b<c){
            System.out.println("numbers in the increasing order");
        } else if (a>b&&b>c) {
            System.out.println("numbers in the decreasing order");
        }else {
            System.out.println("invalid order");
        }

        }
    }