package oop.calculator.service;

import oop.calculator.model.ComplexNumber;
import oop.calculator.model.Operator;

public interface Service {
    ComplexNumber setComplexNumber(String real, String imaginary);
    Operator setOperator(String argument);
}
