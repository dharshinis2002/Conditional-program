import java.util.Scanner;
public class Greatestnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the first num");
        int a=in.nextInt();

        System.out.println("enter the second num");
        int b =in.nextInt();

        System.out.println("enter the third num");
        int c=in.nextInt();

        if(a>b&a>c){
            System.out.println("a is the  greatest num");

        }
        if(b>a&b>c){
           System.out.println("b is the greatest num");
        }
        if(c>a&c>b){
           System.out.println("c is the greatest num");
        }

    }
}
