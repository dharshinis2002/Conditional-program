import java.util.Scanner;

public class Numberofdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        long n = in.nextLong();

        if(n<10){
            System.out.println(1);
        } else if (n<100) {
            System.out.println(2);
        } else if (n<1000) {
            System.out.println(3);
        } else if (n<10000) {
            System.out.println(4);
        } else if (n<100000) {
            System.out.println(5);
        } else if (n<1000000) {
            System.out.println(6);
        }else {
            System.out.println("number is not an integer");
        }

    }

}