public class MathOperation {

    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";

    private final Double a;
    private final Double b;
    private final String operation;
    private Double result;

    public MathOperation(Double a, Double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculateResult() {
        switch (operation) {
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new ArithmeticException("Division by O");
                } else {
                    result = a / b;
                }
            }
            case ADD -> result = a + b;
            case SUBTRACT -> result = a - b;
            default -> throw new ArithmeticException("Operation not known");
        }
    }

    @Override
    public String toString() {
        try {
            if (result == null) {
                calculateResult();
            }
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        return a + " " + (operation.charAt(operation.length() - 1)) + " " + b + " = " + result;
    }
}
