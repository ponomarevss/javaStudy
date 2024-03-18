package oop.calculator.presenter;

import oop.calculator.model.ComplexCalcImpl;
import oop.calculator.model.ComplexNumber;
import oop.calculator.model.Operator;
import oop.calculator.service.Service;
import oop.calculator.view.View;

public class CalcPresenter {
    View view;
    Service service;

    public CalcPresenter(View view, Service service) {
        this.view = view;
        this.service = service;
    }

    public void calculate() {
        view.set("Set first argument ...");
        ComplexNumber first = setArgument();
        view.set("Set second argument ...");
        ComplexNumber second = setArgument();
        Operator operator = setOperator();
        ComplexNumber result = getResult(first, second, operator);
        view.set("(" + first + ") " + operator + " (" + second + ") = " + result);
    }

    private ComplexNumber setArgument() {
        ComplexNumber argument = null;
        while (argument == null) {
            argument = service.setComplexNumber(
                    view.get("real part: "), view.get("imaginary part: ")
            );
            view.set("Your input: " + argument);
            if (argument == null) {
                view.set("Argument is not set");
            }
        }
        return argument;
    }

    private Operator setOperator() {
        Operator operator = null;
        while (operator == null) {
            operator = service.setOperator(view.get("Choose action: "));
            view.set("Your input: " + operator);
            if (operator == null) {
                view.set("Operator is not set");
            }
        }
        return operator;
    }

    private ComplexNumber getResult(ComplexNumber first, ComplexNumber second, Operator operator) {
        switch (operator) {
            case ADDITION:
                return ComplexCalcImpl.addition(first, second);
            case MULTIPLICATION:
                return ComplexCalcImpl.multiplication(first, second);
            case DIVISION:
                return ComplexCalcImpl.division(first, second);
            default:
                return null;
        }
    }
}
