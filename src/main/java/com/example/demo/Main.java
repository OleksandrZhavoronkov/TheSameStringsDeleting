package com.example.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringContainer = new String[6];

        for (int i = 0; i < stringContainer.length; i++) {
            stringContainer[i] = scanner.nextLine();
        }

        for (int i = 0; i < stringContainer.length; i++) {
            String mediator = stringContainer[i];
            for (int j = i+1; j < stringContainer.length-1; j++) {
                if (mediator == null) {
                    break;
                }
                if (mediator.equalsIgnoreCase(stringContainer[j])) {
                    stringContainer[i]=null;
                    stringContainer[j]=null;
                }
            }
        }
        for (int i = 0; i < stringContainer.length; i++) {
            System.out.print(stringContainer[i] + ", ");
        }
    }
}
