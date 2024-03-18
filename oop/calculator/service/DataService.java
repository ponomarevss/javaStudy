package oop.calculator.service;

import oop.calculator.model.ComplexNumber;
import oop.calculator.model.Operator;

public class DataService implements Service {
    @Override
    public ComplexNumber setComplexNumber(String real, String imaginary) {
        if (isDouble(real) && isDouble(imaginary)) {
            return new ComplexNumber(Double.parseDouble(real), Double.parseDouble(imaginary));
        }
        return null;
    }

    @Override
    public Operator setOperator(String argument) {
        switch (argument) {
            case "+": return Operator.ADDITION;
            case "*": return Operator.MULTIPLICATION;
            case ":":
            case "/":
                return Operator.DIVISION;
            default: return null;
        }
    }

    private boolean isDouble(String value) {
        if (value == null) {
            return false;
        }
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException: " + e.getMessage());
            return false;
        }
        return true;
    }
}