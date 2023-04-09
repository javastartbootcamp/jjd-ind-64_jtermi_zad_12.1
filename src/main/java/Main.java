class Main {
    public static void main(String[] args) {
        String fileName = "operations.txt";

        FileOperations fileReader = new FileOperations();
        MathExtractor mathExtractor = new MathExtractor();

        String[] linesInFile = fileReader.linesToArray(fileName);

        MathOperation[] mathOperations = mathExtractor.extractMathExpressionToTable(linesInFile);

        for (MathOperation mathOperation : mathOperations) {
            System.out.println(mathOperation.toString());
        }
    }
}