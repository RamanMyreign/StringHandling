package main4;

public class Replace {

    private String str;
    String str1;
    String x="";
    int k=1;


    Replace(String str){
        this.str=str;
        str1=str.toLowerCase();
        char a[]=str1.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u') {

                if((k%3==1)){
                x = x + "*";
                }
                if(k%3==2) {
                    x = x + "^";
                }
                if(k%3==0)
                {   x=x+"!";
            }
                k++;
            }

            else
                x=x+str.charAt(i);

        }}

    @Override
    public String toString() {
        return x;
    }
}
