package main2;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the string");

        String input=scan.nextLine();

        System.out.println("enter the starting index");
        int index=scan.nextInt();
        System.out.println("enter the ending index");
        int index1=scan.nextInt();

        Substring obj=new Substring(input , index-1,index1-1);
        System.out.println(obj);


    }
}
