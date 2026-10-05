package com.example.minipeta3.MiniPETA3;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MiniPeta3Test {

    @Test
    public void testAttendanceSystem() {
        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING ATTENDANCE DATA ---");

        // Step 1: Are you present?(No)
        automatedInput.append("1\n"); // Choose
        automatedInput.append("2\n"); // Enter age 15 (Expected : Not Present)

        // Step 2: Are you present? (Yes)
        automatedInput.append("1\n"); // Choose
        automatedInput.append("3\n"); // Enter 3 (Expected: Present)

        // Step 3: Exit system
        automatedInput.append("4\n"); // Choose Exit

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        MiniPeta3 cinemaSystem = new MiniPeta3();
        cinemaSystem.start(scanner);
    }
}
