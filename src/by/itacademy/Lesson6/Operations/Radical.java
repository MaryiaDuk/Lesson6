package by.itacademy.Lesson6.Operations;

import by.itacademy.Lesson6.Exceptions.RadicalException;

public class Radical {
    public double resultOfRadical(double a, double b) throws RadicalException {
        if (b==0) throw new RadicalException("Невозможно взятие корня нулевой степени!!!");
        return Math.pow(a, 1/b);
    }
}
