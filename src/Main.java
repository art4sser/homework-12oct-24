import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        // 2.5.;
        int day = 234;
        int week = day / 7;
        System.out.println("Полных недель прошло " + week);


        // 2.6.;
        int hour = 1;
        int minute = 1;
        int second = 1;

        int hours = hour * 24;
        int minutes = minute * 60;
        int seconds = second * 60;

        Sustem.out.println("Прошло n часов " + hours);
        Sustem.out.println("Прошло n минут " + minutes);
        Sustem.out.println("Прошло n секунд " + seconds);

        // 2.13;

        int number = 123;
        int numbers = number;
        int reverted = 0;
        int count = 3;
        for (int i = 0; i < count; i++){
            int digit = numbers % 10;
            reverted = reverted * 10 + digit;
            numbers = numbers/10;
        }
        System.out.println("Reverted " + number + " is " + reverted);

        // 2.19;
        int number4 = 4321;
        int count4 = 4;
        int sum = 0, mult = 1;
        for (int i = 0; i < count4; i++){
            int digit = number4 % 10;
            sum = sum + digit;
            mult = mult * digit;
            number4 = number4 / 10;
        }
        System.out.println(sum);
        System.out.println(mult);

        // 4.9;
        int km = 5;
        int m = 3;
        int mm = m * 60 * 60;
        if (km > mm) {
            System.out.println("Скорость 5 км в час больше чем 3 м в сек");
        } else {
            System.out.println("Скорость 3 м в сек больше чем 5 км в час");
        }

        // 4.10;
        int radius = 10;
        int side = 14;
        int raS =  PI * radius*radius;
        int squS = side * side;
        if (raS > squS) {
            System.out.println("Площадь круга больше");
        } else {
            System.out.println("Площадь квадрата больше");
        }

        // 4.13 извините я еще не прошел корни;

        // 4.96 такое еще не проходил в школе;

        //4.97;

        int num1 = scanner.nextInt();
        System.out.print("Введите первое число: ");

        int num2 = scanner.nextInt();
        System.out.print("Введите второе число: ");

        int num3 = scanner.nextInt();
        System.out.print("Введите третье число: ");

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        int mid = num1 + num2 + num3 - max - min;

        System.out.println("Самое большое число: " + max);
        System.out.println("Самое маленькое число: " + min);
        System.out.println("Среднее число: " + mid);
    }
}

//  4.122;

        double a = scanner.nextDouble();
        System.out.print("Введите сторону a: ");

        double b = scanner.nextDouble();
        System.out.print("Введите сторону b: ");

        double c = scanner.nextDouble();
        System.out.print("Введите сторону c: ");

        if (a + b > c && a + c > b && b + c > a) {
        System.out.println("Треугольник существует.");
        } else {
                System.out.println("Треугольник не существует.");
        }
    }
}