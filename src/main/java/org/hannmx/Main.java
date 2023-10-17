package org.hannmx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел: ");
        String[] input = scanner.nextLine().split(" ");

        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Количество чётных элементов массива: " + ArrayUtils.countEvent(array));
        System.out.println("Разница между самым большим и самым маленьким элементами массива: " + ArrayUtils.findDifference(array));
        System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением: " + ArrayUtils.hasZeroes(array));
    }
}