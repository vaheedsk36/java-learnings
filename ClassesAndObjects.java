class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    // Method overloading example
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int multiply(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public void printFinalResult(String type,int value){
        System.out.println(type+value);
    }

}

public class ClassesAndObjects {
    public static void main(String[] arg){

        int num1 = 2;
        int num2 = 3;
        int num3 = 4;

        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        int subtract = calc.subtract(num1, num2);
        int multiply = calc.multiply(num1, num2);
        int multiplyThreeNums = calc.multiply(num1, num2,num3);
        calc.printFinalResult("sum ",sum);
        calc.printFinalResult("subtract ",subtract);
        calc.printFinalResult("multiply ",multiply);
        calc.printFinalResult("multiplyThreeNums ",multiplyThreeNums);

    }
    
}
