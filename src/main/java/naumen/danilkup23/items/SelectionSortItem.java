package naumen.danilkup23.items;

import naumen.danilkup23.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SelectionSortItem extends Item {
    private final Random random = new Random();
    private final double RAND_MAX = 100.0;
    private final double RAND_MIN = -100.0;
    private final Scanner scanner = new Scanner(System.in);

    public SelectionSortItem() {
        title = "Задание №2. Сортировка выбором массива случайных вещественных чисел";
    }

    @Override
    public void execute() {
        int length = ScannerUtil.getValidatedInput("Введите длину массива", scanner);

        List<Double> doubleList = new ArrayList<>(length);
        System.out.print("Исходный массив:");
        for(int i = 0; i < length; ++i) {
            double randomValue = random.nextDouble(RAND_MAX - RAND_MIN + 1) + RAND_MIN;
            System.out.printf(" %.3f", randomValue);
            doubleList.add(randomValue);
        }
        System.out.println();

        // Time complexity - O(n^2)
        for(int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < length; j++) {
                if (doubleList.get(j) < doubleList.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                var temp = doubleList.get(i);
                doubleList.set(i, doubleList.get(minIndex));
                doubleList.set(minIndex, temp);
            }
        }

        System.out.print("Отсортированный массив:");
        for(double value : doubleList) {
            System.out.printf(" %.3f", value);
        }
        System.out.println();
    }
}
