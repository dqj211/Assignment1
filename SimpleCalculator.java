import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SimpleCalculator implements Calculable {

    @Override
    public String calculate(String expression) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return String.valueOf(engine.eval(expression));
        } catch (ScriptException e) {
            return "Invalid expression";
        }
    }

}
