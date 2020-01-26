import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Scanner(System.in));
        String score = calculator.operation();
        double num1 = calculator.number();
        double num2 = calculator.number();
        double calc = calculator.calculate(score, num1, num2);
        System.out.println("Result: " + calc);
    }
}
