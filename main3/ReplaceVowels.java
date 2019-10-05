package main3;

public class ReplaceVowels {

    private String str;
    String str1;
    String x="";


    ReplaceVowels(String str){
        this.str=str;
        str1=str.toLowerCase();
        char a[]=str1.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u')
                x=x+"*";
            else
                x=x+str.charAt(i);

        }}

        @Override
                public String toString() {
            return x;
        }
}

