import java.util.HashMap;
import java.util.Map;

// Context class to hold variables and their values
class Context {
    private Map<String, Integer> variables;

    public Context() {
        this.variables = new HashMap<>();
    }

    public int getValue(String varName) {
        return variables.getOrDefault(varName, 0);
    }

    public void setValue(String varName, int value) {
        variables.put(varName, value);
    }
}

// Abstract Expression class
abstract class Expression {
    public abstract int interpret(Context context);
}

// Terminal Expression representing a number
class Number extends Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}

// Non-terminal Expression representing addition
class Plus extends Expression {
    private Expression left;
    private Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

// Non-terminal Expression representing subtraction
class Minus extends Expression {
    private Expression left;
    private Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}

// Non-terminal Expression representing multiplication
class Multiply extends Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

public class Interpreter {
    public static void main(String[] args) {
        Context context = new Context();
        context.setValue("x", 3);
        context.setValue("y", 5);

        // Interpret the expression: x + y * 2
        Expression expression = new Plus(
                new Number(context.getValue("x")),
                new Multiply(
                        new Number(context.getValue("y")),
                        new Number(2)));
        int result = expression.interpret(context);
        System.out.println("Result: " + result); // Output: 13
    }
}
