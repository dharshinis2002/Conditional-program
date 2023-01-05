import java.util.Scanner;

public class SumndAverage {
    public static void main(String[] args) {
        int sum = 0;
        double avg;

        {
            System.out.println("enter 5 numbers");
        }

         for (int i=0;i<5;i++){
             Scanner in = new Scanner(System.in);
             int num = in.nextInt();
             sum=sum+num ;
}

        avg=sum/5;
        System.out.println("average of 5 numbers is:"+avg);
        System.out.println("sum:"+sum);

    }
}