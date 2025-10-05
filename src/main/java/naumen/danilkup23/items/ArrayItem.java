package naumen.danilkup23.items;

import naumen.danilkup23.utils.ScannerUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayItem extends Item{
    private final Random random = new Random();
    private final int RAND_MIN = -100;
    private final int RAND_MAX = 100;
    private final Scanner scanner = new Scanner(System.in);

    public ArrayItem() {
        title = "Задание №1. Последний положительный элемент в массиве случайных чисел";
    }


    @Override
    public void execute() {
        int length = ScannerUtil.getValidatedInput("Введите длину массива", scanner);

        int[] array = new int[length];
        Integer lastPositiveNumber = null;
        System.out.print("Сгенерированный массив:");
        for(int i = 0; i < length; ++i) {
            array[i] = random.nextInt(RAND_MAX - RAND_MIN + 1) + RAND_MIN;
            if (array[i] > 0) lastPositiveNumber = array[i];
            System.out.print(" " + array[i]);
        }
        System.out.println();

        if (lastPositiveNumber != null) System.out.println("Последний положительный элемент в массиве: " + lastPositiveNumber);
        else System.out.println("В массиве нет положительных чисел!");
    }
}
