package naumen.danilkup23.utils;

import java.util.Scanner;

public class ScannerUtil {
    public static int getValidatedInput(String template, Scanner scanner) {
        int input = 0;
        while (true) {
            System.out.print(template + " >> ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            else {
                System.out.println("The input value must be integer!");
                scanner.next();
            }
        }
        return input;
    }
}
