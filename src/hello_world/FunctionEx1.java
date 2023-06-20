package hello_world;
import java.util.function.Function;
public class FunctionEx1 {

    public static void main(String[] args) {

        Function<String, Integer> func = (text) -> text.length();

        int length = func.apply("Function interface tutorial");

        System.out.println("Length: " + length);
    }
}