package oop.calculator.model;

public enum Operator {
    ADDITION ("+"),
    MULTIPLICATION ("*"),
    DIVISION ("/");

    private final String sign;

    Operator(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }
}
