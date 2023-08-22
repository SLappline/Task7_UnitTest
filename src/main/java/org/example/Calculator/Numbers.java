package org.example.Calculator;

import java.util.InputMismatchException;

import static org.example.Main.scanner;

public class Numbers {
    public static double numbers() {
//        Запрашиваем ввод двух чисел через консоль.
//        В случае ошибки, вводим повторно.
        double num;
        try{
            System.out.print("Введите дробное число:");
            num = Double.parseDouble(scanner.next());
        }
        catch (NumberFormatException e){
            System.out.println("Вы не верно ввели число.");
            System.out.println("Укажите дробное число через точку\".\"");
            return numbers();
        }
        //Возвращаем введенные числа
        return num;
    }
}
