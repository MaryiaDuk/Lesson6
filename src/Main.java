import by.itacademy.Lesson6.Exceptions.DivisionByZeroException;
import by.itacademy.Lesson6.Exceptions.InvalidOperationException;
import by.itacademy.Lesson6.Exceptions.RadicalException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите данные: сначала 1е число, затем операция, затем 2е число");
        System.out.println("Виды операций: +, -, *, /, ^, корень");
        InputData inputData = new InputData();
        Calculator calculator = inputData.input();
        try {
            System.out.println(calculator.result());
        } catch (DivisionByZeroException | InvalidOperationException | RadicalException e) {
            e.printStackTrace();
        }
    }
}