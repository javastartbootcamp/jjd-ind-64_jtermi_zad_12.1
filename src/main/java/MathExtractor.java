public class MathExtractor {

    public MathOperation[] extractMathExpressionToTable(String[] linesInFile) {
        MathOperation[] mathOperations = new MathOperation[linesInFile.length];
        for (int i = 0; i < linesInFile.length; i++) {
            mathOperations[i] = splitMathExpression(linesInFile[i]);
        }
        return mathOperations;
    }

    private MathOperation splitMathExpression(String line) {

        String[] splitArray = line.split(" ", 3);

        return new MathOperation(Double.parseDouble(splitArray[0]),
                Double.parseDouble(splitArray[2]),
                splitArray[1]);
    }
}
