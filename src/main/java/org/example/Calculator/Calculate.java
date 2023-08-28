package org.example.Calculator;


public class Calculate {
    public static double value;

    public static Object calc(double num1, double num2, char operation) {

        try {
            if (num2 == 0 & operation == '/') {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
            return new ArithmeticException();
        }
        double sum = 0;
        /*Используем оператор выбора для полученного значения operation
        Если операция отличается от доступных, выводим ошибку с возможностью повторно ввести операцию.*/
        switch (operation) {
            case '+' -> sum = num1 + num2;
            case '-' -> sum = num1 - num2;
            case '*' -> sum = num1 * num2;
            case '/' -> sum = num1 / num2;
            default -> {
                System.out.println("Операция не верна. Попробуйте снова.");
            }
        }
        //Возвращаем результат проведенной операции
        Calculate result = new Calculate();
        setValue(sum);
        return result;
    }

    public static double getValue() {
        return value;
    }

    public static void setValue(double value) {
        Calculate.value = value;
    }
}
