import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Calculator {
    private Scanner scanner;
    private final Set<String> operations = new HashSet<String>(){
        {
            add("+");
            add("-");
            add("*");
            add("/");
        }
    };

    public Calculator(Scanner scanner){
        this.scanner = scanner;
    }

    /**
     * заходим в do, вводим операцию и присваиваем в oper. Далее если oper существует в предопределённых operations то возвращаем оперцию
     * иначе повторяем итерацию цикла.
     * @return
     */
    public String operation() {
        String oper = null;
        do {
            System.out.println("Select operation : " + " + ; - ; * ; / ;");
            System.out.println("Операция: ");
            oper = scanner.nextLine();
        } while (!operations.contains(oper)); // contains проверяет сущесвтует ли операция в operations. !operations если не существует...
        return oper;
    }

    public double number() {
        System.out.print("Enter number: ");
        double n = 0;
        while(true) {
            try {
                n = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Please, enter only of number!");
            }
        }
        return n;
    }

    public double calculate (String score, double num1, double num2) {
        double result = 0;
        switch (score) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0.0) {
                    result = num1 / num2;
                } else{
                    System.out.println("Error! It is impossible to divide by zero!");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Error! Please, enter a transaction number from 1 to 4!");
        }
        return result;
    }
}