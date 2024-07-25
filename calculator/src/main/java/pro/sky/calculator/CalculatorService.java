package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInt {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int number1, int number2) {
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    @Override
    public String minus(int number1, int number2) {
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    @Override
    public String multiply(int number1, int number2) {
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    @Override
    public String divide(int number1, int number2) {
        return number1 + " / " + number2 + " = " + (number1 / number2);
    }

    public String textError() {
        return "Введите корректные значения";
    }
}

