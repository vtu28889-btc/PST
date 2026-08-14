import java.util.*;

class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

   
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

public class CalculatorUnitTesting {

    
    static boolean testAddition() {
        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        return result == 30;
    }

    
    static boolean testDivision() {
        Calculator calc = new Calculator();

        double result = calc.divide(20, 10);

        return result == 2.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        Calculator calc = new Calculator();

        boolean passed = false;

        if (operator.equals("+")) {
            int result = calc.add(a, b);
            passed = (result == a + b);
        }
        else if (operator.equals("/")) {
            if (b != 0) {
                double result = calc.divide(a, b);
                passed = (result == (double) a / b);
            }
        }

        
        if (passed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}