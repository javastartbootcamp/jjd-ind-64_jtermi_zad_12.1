public class MathExtractor {

    public MathOperation[] extractMathExpressionToTable(String[] fileToArray) {
        MathOperation[] mathOperations = new MathOperation[fileToArray.length];
        for (int i = 0; i < fileToArray.length; i++) {
            mathOperations[i] = splitMathExpression(fileToArray[i]);
        }
        return mathOperations;
    }

    private MathOperation splitMathExpression(String fileToArray) {

        String[] splitArray = fileToArray.split(" ", 3);

        return new MathOperation(Double.parseDouble(splitArray[0]),
                Double.parseDouble(splitArray[2]),
                splitArray[1]);
    }
}
