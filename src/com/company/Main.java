package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int x1 = input.nextInt();
        System.out.println("Введите второе целое число: ");
        int x2 = input.nextInt();
        System.out.println("Введите третье целое число: ");
        int x3 = input.nextInt();
        System.out.println("Введите четвертное целое число: ");
        int x4 = input.nextInt();
        System.out.println("Введите пятое целое число: ");
        int x5 = input.nextInt();
        int count0=0;//счетчик нулевых
        int count1=0; //счетчик положительных
        int count2=0; //счетчик отрицательных

        int[] arr = {x1, x2, x3, x4, x5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count1++;
            if(arr[i]<0) count2++;
            if(arr[i]==0) count0++;
        }

        System.out.println("Нулевые числа: "+count0 + " ||| " + " Положительные числа: "+count1+" ||| "+"Отрицательные числа: "+count2);
    }
}


