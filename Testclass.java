import java.util.Scanner;

public class Testclass{
    private int x,y;
    private static int myx = 5;
    private String eqs;
    public Testclass(){
        eqs = "eqs";
    }
    public Testclass(int inPut_X)
    {
        x = inPut_X;
        y = 5;
    }
    public Testclass(int inPut_X,int inPut_Y,String inPut_String)
    {
        x = inPut_X;
        y = inPut_Y;
        eqs = inPut_String;
    }
    public void updateX(int data){
        this.x = data;
    }
    public void Testprint() {
    	System.out.println(x + y);
    }
    public static void TestprintX() {
        System.out.println(myx);
    }
    public String getString(){
        return eqs+"oop";
    }
    public static String getStaticString(){
        return "eqstaticnotextend";
    }
    public String getMyString(){
        return "getmy";
    }
    public String getMyMyString(){
        return "getmymy";
    }
}
