import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;

public class CalculatorApp {
    private final String CALCULATION_PATTERN = "%s%s%s";

    public int calculate(String firstNum, String secondNum, String opereator){
        int result = 0;
        ScriptEngineManager script = new ScriptEngineManager();
        ScriptEngine eng = script.getEngineByName("JavaScript");
        try {
            result = parseInt(eng.eval(format(CALCULATION_PATTERN, firstNum, opereator, secondNum)).toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return result;
    }
}
