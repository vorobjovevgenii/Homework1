import java.util.Scanner;
import java.util.Random;

public class zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randon = new Random();
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();
        while (length < 1) {
            System.out.println("Размер массива должен быть больше 0: ");
            System.out.println("Введите размер массива: ");
            length = scanner.nextInt();
        }
        System.out.println("Введите А: ");
        int min = scanner.nextInt();
        System.out.println("Введите В: ");
        int max = scanner.nextInt();
        while (max < min) {
            System.out.println("Неверный диапазон.");
            System.out.println("Введите А: ");
            min = scanner.nextInt();
            System.out.println("Введите В: ");
            max = scanner.nextInt();
        }

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = randon.nextInt(max + 1 - min) + min;
        }

        for (int a : array) {
            System.out.print( a + " ");
        }

        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        System.out.println();

        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}


/*
⦁	Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Выведите массив на экран,
после чего инвертируйте его и выведите уже инвертрованный массив
 */