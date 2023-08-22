package org.example.Calculator;

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
                    if (num2 != 0){
                        result = num1 / num2;
                    }
                }
                catch (Exception e){
                    System.out.println("На ноль делить нельзя");
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
