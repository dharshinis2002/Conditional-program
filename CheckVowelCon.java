import java.util.Locale;
import java.util.Scanner;

public class CheckVowelCon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("enter any alphabet");
        }
        String l = in.next().toLowerCase();

        char ch = 'i';
        if ((ch == 'a') || (ch == 'e') ||(ch == 'i') ||(ch == 'o') || (ch == 'u')) {
            System.out.println(ch+"it is vowel");
        } else {
            System.out.println(ch+"it is consonant");
        }

    }
}



