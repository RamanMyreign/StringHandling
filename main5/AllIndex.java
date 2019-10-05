package main5;
import java.util.Scanner;
public class AllIndex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char x=scan.next().charAt(0);
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == x) {
                System.out.println(i + 1);
            }
        }
    }
}