package main5;
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine();
        System.out.println("enter the string to be replaced");
        String str1=scan.nextLine();
        System.out.println("enter the replacement string");
        String str2=scan.nextLine();
        System.out.println(str.replaceAll(str1,str2));

    }
}
