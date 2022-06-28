package com.input;

import java.util.Scanner;

import com.knoldus.Operation.OperationCalculator;

public class inputModule {
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter first number: ");
            int a = scanner.nextInt();
            System.out.print("\nEnter second number: ");
            int b = scanner.nextInt();
            System.out.print("\nOperations \n\n1. ADD \n2. SUBTRACT \n3. MULTIPLY \n4. Divide \n\nEnter your choice: ");
            int choice = scanner.nextInt();
            OperationCalculator calculate = new OperationCalculator();
            switch (choice) {
                case 1:
                    calculate.add(a, b);
                    break;
                case 2:
                    calculate.sub(a, b);
                    break;
                case 3:
                    calculate.mul(a, b);
                    break;
                case 4:
                    calculate.div(a, b);
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
}
