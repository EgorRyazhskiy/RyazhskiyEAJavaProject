package ru.mirea.ryazhskiy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] numberArray;
        int arrayLenght;
        int numToFind;
        System.out.println("Введите длину массива:");
        arrayLenght = scan.nextInt();
        numberArray = new int[arrayLenght];
        System.out.println("Введите число для поиска:");
        numToFind = scan.nextInt();
        for (int i = 0; i < arrayLenght; i++) {
            numberArray[i] = random.nextInt(0, 1000);
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        int x=Sort(numToFind,numberArray,arrayLenght);
        System.out.println("Количество операций:" + x);    }

    static int Sort(int key, int[] arr, int Lenght) {
        int x=0;
        int left = 0;
        int right = Lenght;
        int medium;
        while (left <= right) {
            medium = left + (right - left) / 2;
            if (key < arr[medium]) {
                right = medium - 1;
                x+=1;
            }
            else if (key > arr[medium]) {
                left = medium + 1;
                x+=1;            }
            else {
                x+=1;
                System.out.println("Искомое число найдено под индексом:" + medium);
                return x;
            }
        }
        System.out.println("Искомое число не найдено");
        return x;

    }

}