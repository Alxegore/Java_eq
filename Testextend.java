public class Testextend extends Testclass{
    public static String getStaticString(){
    	return "eqstatic";
    }
    @Override
    public String getMyString(){
        return "getmyoverride";
    }
}