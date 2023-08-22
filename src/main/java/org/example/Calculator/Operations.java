package org.example.Calculator;


import static org.example.Main.scanner;

public class Operations {
    public static char getOperation() {
        char operation;
        try{
            System.out.print("Выберите операцию:");
            operation = scanner.next().charAt(0);
        }
        catch (NumberFormatException e){
            System.out.println("Вы неверно ввели операцию. Попробуйте снова.");
            return getOperation();
        }
        return operation; //Возвращаем введенную операцию
    }
}
