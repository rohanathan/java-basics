public class MainClass {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        calc.setFirstNumber(6);
        calc.setSecondNumber(9);
        double addResult = calc.getAdditionResult();
        double subResult = calc.getSubtractionResult();
        double mulResult = calc.getMultiplicationResult();
        double divResult = calc.getDivisionResult();
        double modResult = calc.getModuloResult();
        System.out.println("Addition Result : " + addResult + "\nSubtraction Result : " + subResult + "\nMultiplication Result : " + mulResult
                + "\nDivision Result : " + divResult + "\nModulo Result : " + modResult);
    }
}
