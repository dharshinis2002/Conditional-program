import java.util.Scanner;

public class Numofcube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i;
        System.out.println("enter the num");
        int num = in.nextInt();

        for (i=0;i<num;i++);
        i=num*num*num;
        System.out.println("number of cub is:"+i);


    }
}
