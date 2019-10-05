package main5;
import java.util.Scanner;
public class UpperWeight {
    public static void main(String[] args) {

        int x =0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if ((int) (str.charAt(i)) >= 65 && (int) (str.charAt(i)) <= 90) {
                x=x+(int)(str.charAt(i));
            }
        }
        System.out.println("uppercase alphabets weight :"+x);
    }
}
