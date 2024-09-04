package ru.mirea.ryazhskiy;
import java.util.ArrayList;
import java.util.Random;

public class First_Practice_3rdNum {
    public static void main(String[] args){


        Random random=new Random();
        int masLength = 10;
        int[] mas1 = new int[masLength];
        int[] mas2 = new int[masLength];
        ArrayList<Integer> mas_sovpad = new ArrayList<>();
        for(int x = 0;x<masLength;x++) {
            mas1[x]= random.nextInt(0,20);
            mas2[x]=random.nextInt(0,20);
        }
        for (int i = 0; i < masLength; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < masLength; i++) {
            System.out.print(mas2[i] + " ");
        }
        for (int x=0;x<masLength;x++){
            for (int i = 0; i < masLength; i++) {
                if (mas1[i] == mas2[x]) {
                    mas_sovpad.add(mas1[i]);
                }
            }
        }
        System.out.println();
        System.out.print(mas_sovpad);
    }
}