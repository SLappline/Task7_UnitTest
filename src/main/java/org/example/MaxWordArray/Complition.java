package org.example.MaxWordArray;

import java.util.ArrayList;
import java.util.List;

import static org.example.Main.scanner;


public class Complition {
    public static String[] getMaxWord() {
        System.out.println("Вы выбрали поиск максимального слова в массиве.");
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        String[] word = new String[n];
        System.out.println("Введите элементы массива.");
        int elementLength = 0;
        List<String> longestWord = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            word[i-1] = scanner.next();
            if(word[i-1].length() >= elementLength) {
                elementLength = word[i-1].length();
                longestWord.add(word[i-1]);
            }
        }
        if (elementLength > 1){
            System.out.println("Самые длинные слова:" + longestWord);
        }
        else if (elementLength == 1){
            System.out.println("Самое длинное слово:" + longestWord);
        }
        return new String[]{longestWord.toString()};
    }

}


