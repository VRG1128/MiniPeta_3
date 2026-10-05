package com.example.minipeta3.MiniPETA3;

import java.util.Scanner;

public class MiniPeta3 {

    public void start(Scanner scanner) {
        while (scanner.hasNextInt()) {
            int option = scanner.nextInt();
            if (option == 4) {
                System.out.println("Exiting system...");
                break;
            }
            if (option == 1 && scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value == 3) {
                    System.out.println("Status: Present");
                } else {
                    System.out.println("Status: Not Present");
                }
            }
        }
    }
}
