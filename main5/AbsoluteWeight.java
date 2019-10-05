package main5;
import java.util.*;
public class AbsoluteWeight {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++)
        {
            if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90)
                upper=upper+(int)(str.charAt(i));
            else
                lower=lower+(int)(str.charAt(i));
        }

        int absweight=upper-lower;
        if(absweight<0)
            absweight=absweight*(-1);
        System.out.println(absweight);
    }
}
