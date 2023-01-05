import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the term of num");
        int num = in.nextInt();
        int i, sum;

        for (i = 1; i < num; i++) {
            sum = i * num;

            System.out.println(num + "*" + i + "=" + sum);
        }
    }
}