package main3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        ReplaceVowels obj =new ReplaceVowels(str);
        System.out.println(obj);
    }
}
