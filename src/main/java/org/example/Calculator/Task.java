package org.example.Calculator;


import static org.example.Calculator.Calculate.calc;
import static org.example.Calculator.Numbers.numbers;
import static org.example.Calculator.Operations.operation;
import static org.example.Main.scanner;
import static org.example.MaxWordArray.Complition.getMaxWord;

public class Task {
    public static int getTask() {
        System.out.print("Выберите номер задачи: (1 - калькулятор, 2 - максимальное слово в массиве): ");
        int task;
        try {
            task = Integer.parseInt(scanner.nextLine());
            if (task == 1) {
                System.out.println("Вы выбрали калькулятор.");
                double num1;
                double num2;
                char operation;
                double result;
                while(true) {
                    System.out.print("Введите дробное число:");
                    Object num_obj1 = numbers(scanner.next());
                    if (num_obj1 instanceof Numbers) {
                        num1 = Numbers.val;
                        break;
                    }
                }
                while(true) {
                    System.out.print("Введите дробное число:");
                    Object num_obj2 = numbers(scanner.next());
                    if (num_obj2 instanceof Numbers) {
                        num2 = Numbers.val;
                        break;
                    }
                }
                while(true) {
                    System.out.print("Выберите операцию:");
                    Object operation_obj1 = operation(scanner.next());
                    if (operation_obj1 instanceof Operations) {
                        operation = Operations.value;
                        break;
                    }
                }
                while(true) {
                    Object calc_obj1 = calc(num1, num2, operation);
                    if (calc_obj1 instanceof Calculate) {
                        result = Calculate.value;
                        break;
                    }else{
                        while(true) {
                            System.out.print("Выберите операцию:");
                            Object operation_obj1 = operation(scanner.next());
                            if (operation_obj1 instanceof Operations) {
                                operation = Operations.value;
                                break;
                            }
                        }
                    }
                }
                System.out.printf("Результат операции: " + "%.4f", result);
                //Выводим на экран результат с округлением до 4 знаков после запятой.
            } else if (task == 2) {
                getMaxWord();
            } else{
                System.out.println("Вы ввели не верный номер задачи.");
                return getTask();
            }
        } catch (NumberFormatException e) {
            System.out.println("Нужно ввести число 1 или 2.");
            return getTask();
        }
        scanner.close();
        return task;
    }
}
