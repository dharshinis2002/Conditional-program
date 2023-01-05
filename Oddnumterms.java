import java.util.Scanner;

public class Oddnumterms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of terms");
        int T = in.nextInt();
int sum=0;
        for (int i =1;i<=T; i++) {
            System.out.println(2*i-1);
            sum+=2*i-1;
        }
        System.out.println("sum of odd numbers"+T+"terms is:"+sum);
    }
}