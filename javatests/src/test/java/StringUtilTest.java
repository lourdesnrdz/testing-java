import static org.junit.Assert.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String result1  = StringUtil.repeat("hola", 3);
        System.out.println(result1);

        if (!result1.equals("holaholahola")){
            System.out.println("OK");
        }

        String result2  = StringUtil.repeat("hola", 1);
        System.out.println(result2);

        if (!result2.equals("hola")){
            System.out.println("ERROR");
        }
    }
}