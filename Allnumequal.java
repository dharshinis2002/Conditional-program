import java.util.Scanner;

public class Allnumequal {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the 1st num");
        int x = num.nextInt();

        System.out.println("enter the 2num");
        int y = num.nextInt();

        System.out.println("enter the 3 num");
        int z = num.nextInt();

      if(x==y&&x==z){
          System.out.println("x,y ,z is equals");
      }else if(y!=z&&y==x){

      System.out.println("x,y ,z is not equals");

      }else{
          System.out.println("x,y,z are different");
      }

    }

    }




