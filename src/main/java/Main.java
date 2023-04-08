class Main {
    public static void main(String[] args) {
        String fileName = "operations.txt";

        FileOperations fileReader = new FileOperations();
        MathExtractor mathExtractor = new MathExtractor();

        String[] arrayOfLines = fileReader.linesToArray(fileName);

        MathOperations[] mathOperations = mathExtractor.extractMathExpressionToTable(arrayOfLines);

        for (MathOperations mathOperation : mathOperations) {
            System.out.println(mathOperation.toString());
        }
    }
}