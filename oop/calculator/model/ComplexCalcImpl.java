package oop.calculator.model;

import static java.lang.Math.pow;

public class ComplexCalcImpl {
    public static ComplexNumber addition(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    public static ComplexNumber multiplication(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal()
        );
    }

    public static ComplexNumber division(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(
                (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) /
                        (pow(b.getReal(), 2) + pow(b.getImaginary(), 2)),
                (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) /
                        (pow(b.getReal(), 2) + pow(b.getImaginary(), 2))
        );
    }
}
