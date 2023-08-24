package org.example.Calculator;

import static org.example.Calculator.Operations.getOperation;

public class Calculate {
    public static double calc(double num1, double num2, char operation) {
        double result = 0;
        /*Используем оператор выбора для полученного значения operation
        Если операция отличается от доступных, выводим ошибку с возможностью повторно ввести операцию.*/
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                try{
                    if (num2 == 0){
                        throw new ArithmeticException("Деление на ноль");
                    }
                    else {
                        result = num1 / num2;
                    }
                }
                catch (ArithmeticException e){
                    System.out.println("На ноль делить нельзя");
                    return getOperation();
                }
            }
            default -> {
                System.out.println("Операция не верна. Попробуйте снова.");
            }
        }
        //Возвращаем результат проведенной операции
        return result;
    }
}
