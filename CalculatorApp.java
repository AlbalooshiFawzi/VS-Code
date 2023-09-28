class CalculatorApp {
     public static void main (String[] args){
        CalculatorTest CT = new CalculatorTest();
        try { CT.setUp(); } catch (Exception e) {};
        CT.testAdd();
        CT.testAdd(2,2,4);
        CT.testSubtract();
        CT.testDivideByZero();
    }
}