import by.itacademy.Lesson6.Operations.*;
import by.itacademy.Lesson6.Exceptions.DivisionByZeroException;
import by.itacademy.Lesson6.Exceptions.InvalidOperationException;
import by.itacademy.Lesson6.Exceptions.RadicalException;

public class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a,String operation, double b) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", operation='" + operation + '\'' +
                '}';
    }

    public double result() throws DivisionByZeroException, InvalidOperationException, RadicalException {
        switch (operation) {
            case "+":
                Summation summation = new Summation();
                return summation.resultOfSumming(a, b);
            case "-":
                Subtraction subtraction = new Subtraction();
                return subtraction.resultOfSubtraction(a, b);
            case "*":
                Multiplication multiplication = new Multiplication();
                return multiplication.resultOfMultiplication(a, b);
            case "/":
                Division division = new Division();
                return division.resultOfDivision(a, b);
            case "^":
                Exponentiation exponentiation = new Exponentiation();
                return exponentiation.resultOfExponentiation(a,b);
            case "корень":
                Radical radical = new Radical();
                return radical.resultOfRadical(a,b);
            default:
                throw new InvalidOperationException("Неизвестная операция");
        }
    }
}