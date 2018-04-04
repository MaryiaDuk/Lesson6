import java.util.Scanner;

public class InputData {
    private double a;
    private double b;
    private String operation;

    public Calculator input() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        scanner.nextLine();
        operation = scanner.nextLine();
        b = scanner.nextDouble();
        Calculator calculator = new Calculator(a, operation, b);
        return calculator;
    }
}