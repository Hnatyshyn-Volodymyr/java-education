package task_1;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main(String[] args) {

        final int CALLS_COUNT = 3;
        double totalCost = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 1; i <= CALLS_COUNT; i++) {

                System.out.printf("Enter cost per minute for call %d: ", i);
                double costPerMinute = scanner.nextDouble();

                System.out.printf("Enter duration (minutes) for call %d: ", i);
                double duration = scanner.nextDouble();

                double callCost = costPerMinute * duration;
                totalCost += callCost;

                System.out.printf("Cost of call %d: %.3f%n%n", i, callCost);
            }

            System.out.printf("Total cost of all calls: %.3f%n", totalCost);
        }
    }
}