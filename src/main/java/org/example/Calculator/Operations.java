package org.example.Calculator;


import java.util.InputMismatchException;

public class Operations {
    public static char value;

    public static Object operation(String operation) {
        char operation_char = getCharFromString(operation, 0);
        boolean c;
        try {
            switch (operation_char) {
                case '+', '/', '-', '*' -> c = false;
                default -> {
                    c = true;
                }
            }
            if(c == true){
                throw  new InputMismatchException();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Вы неверно ввели операцию. Попробуйте снова.");
            return new InputMismatchException();
        }
        Operations result = new Operations();
        setValue(operation_char);
        return result;
    }

    private static char getCharFromString(String operation, int i) {
        return operation.charAt(0);
    }

    public static char getValue() {
        return value;
    }

    public static void setValue(char value) {
        Operations.value = value;
    }
}
