package main2;

public class Substring {
    private String input;
    private int index;

    String substr;

    Substring(String input, int index,int index1)
    {
        substr=input.substring(index,index1);

    }
    @Override
    public String toString()
    {
        return "Substring : "+substr;
    }

}
