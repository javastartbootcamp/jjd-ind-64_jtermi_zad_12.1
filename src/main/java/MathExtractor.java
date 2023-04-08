public class MathExtractor {

    public MathOperations[] extractMathExpressionToTable(String[] fileToArray) {
        MathOperations[] mathOperations = new MathOperations[fileToArray.length];
        for (int i = 0; i < fileToArray.length; i++) {
            mathOperations[i] = splitMathExpression(fileToArray[i]);
        }
        return mathOperations;
    }

    private MathOperations splitMathExpression(String fileToArray) {

        String operation;

        if (fileToArray.contains("*")) {
            operation = "\\*";
        } else if (fileToArray.contains("/")) {
            operation = "/";
        } else if (fileToArray.contains("+")) {
            operation = "\\+";
        } else if (fileToArray.contains("-")) {
            operation = "-";
        } else {
            throw new ArithmeticException("operation not known");
        }

        String[] splitArray = fileToArray.split(operation, 2);

        return new MathOperations(Double.parseDouble(splitArray[0]),
                Double.parseDouble(splitArray[1]),
                operation);
    }
}
