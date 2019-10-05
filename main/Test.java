package main;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String x=scan.nextLine();
        Handling obj=new Handling(x);
        System.out.println(obj);
    }
}
