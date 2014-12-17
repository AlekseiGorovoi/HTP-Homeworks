package com.gorovoi;

import java.util.Random;

/**
 * Created by Zmei on 15.12.2014.
 */

public class MagicNum {

    public static void main(String[] args) {

        Random number = new Random();
        int magicNum = number.nextInt(899) + 101;

        System.out.println("Сгенерированно число " + magicNum);

        int lucky = 0;

        switch (magicNum) {
            case 302:
                System.out.println(magicNum + " - магическое число");
                lucky = 1;
                break;
            case 409:
                System.out.println(magicNum + " - магическое число");
                lucky = 1;
                break;
            case 781:
                System.out.println(magicNum + " - магическое число");
                lucky = 1;
                break;
            case 941:
                System.out.println(magicNum + " - магическое число");
                lucky = 1;
                break;
        }

        int numToArr = magicNum;
        int[] num = new int[3];
        for (int row = 0; row < 3; row++) {
            num[row] = numToArr % 10;
            numToArr /= 10;
        }

        if (num[0] == num[1]) {
            if (num[1] == num[2]) {
                System.out.println(magicNum + " - счастливое число");
                lucky = 1;
            }
        }

        if (num[0] - 1 == num[1]) {
            if (num[1] - 1 == num[2]) {
                System.out.println(magicNum + " - счастливое число");
                lucky = 1;
            }
        }

        if (num[0] + 1 == num[1]) {
            if (num[1] + 1 == num[2]) {
                System.out.println(magicNum + " - счастливое число");
                lucky = 1;
            }
        }

        if (lucky == 0) {
            System.out.println(magicNum + " - несчастливое число");
        }


    }
}
