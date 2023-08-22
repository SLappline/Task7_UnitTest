package org.example;


import java.util.Scanner;

import static org.example.Calculator.Task.getTask;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getTask();
        scanner.close();
    }
}

