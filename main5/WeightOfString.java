package main5;
import java.util.Scanner;
public class WeightOfString {
    public static void main(String[] args) {
        int weight=0;
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        for(int i=0;i<input.length();i++)
        {
            weight=weight+(int)(input.charAt(i));
        }
        System.out.println("Weight = "+weight);
    }
}
