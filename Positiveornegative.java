import java.util.Scanner;

public class Positiveornegative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();

        if(num>0){
            System.out.println("number is positive");
        }
        else if(num<0){
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is equal");
            
        }
    }
}
