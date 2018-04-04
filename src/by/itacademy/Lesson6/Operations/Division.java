package by.itacademy.Lesson6.Operations;

import by.itacademy.Lesson6.Exceptions.DivisionByZeroException;

public class Division {
    public double resultOfDivision(double a, double b) throws DivisionByZeroException {
        if (b ==0) throw new DivisionByZeroException("Деление на ноль запрещено!!!");
        return a / b;
    }
}
