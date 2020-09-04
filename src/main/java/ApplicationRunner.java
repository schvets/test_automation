import java.util.HashMap;
import java.util.Map;

public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("#############################################################");
        System.out.println("FIRST IMPLMENTATION");
        CalculatorApp calc = new CalculatorApp();

        System.out.println(calc.calculate("2", "2", "+"));
        System.out.println(calc.calculate("5", "5", "*"));
        System.out.println(calc.calculate("5", "5", "/"));
        System.out.println(calc.calculate("100", "5", "-"));

        System.out.println("#############################################################");
        System.out.println("SECOND IMPLMENTATION");

        Map<String, CalculatorAppSecondImpl.Arithmetic> operators = new HashMap<String, CalculatorAppSecondImpl.Arithmetic>();
        operators.put("+", new CalculatorAppSecondImpl.Add());
        operators.put("-", new CalculatorAppSecondImpl.Subtract());
        operators.put("*", new CalculatorAppSecondImpl.Multiply());
        operators.put("/", new CalculatorAppSecondImpl.Divide());

        System.out.println(operators.get("+").apply(2,2));
        System.out.println(operators.get("*").apply(5,5));
        System.out.println(operators.get("/").apply(5,5));
        System.out.println(operators.get("-").apply(100,5));


    }
}
