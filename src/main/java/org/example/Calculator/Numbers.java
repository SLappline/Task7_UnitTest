package org.example.Calculator;


public class Numbers {
    public static double val;

    public static Object numbers(String num) {
//        Запрашиваем ввод двух чисел через консоль.
//        В случае ошибки, вводим повторно.
        try{
            Double.parseDouble(num);
        }
        catch (NumberFormatException e){
            System.out.println("Вы не верно ввели число.");
            System.out.println("Укажите дробное число через точку\".\"");
            return new NumberFormatException();
        }
        Numbers result = new Numbers();
        setVal(Double.parseDouble(num));
        return result;
        //Возвращаем введенные числа
    }

    public static double getVal() {
        return val;
    }

    public static void setVal(double val) {
        Numbers.val = val;
    }
}
