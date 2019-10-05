package main;

public class Handling {
    private String x;
    private String y = "";
    private String z = "";
    int i = 0;

    Handling(String x) {
        this.x = x;
        int len = x.length();
        char a[] = x.toCharArray();
        for (i = 0; i < len; i++) {
            y = y.concat("\t" + a[i]);
            z = z.concat("\t" + i);
        }

    }
    @Override
    public String toString()
    {  return "index: "+z+"\nchars: "+y;
    }
}