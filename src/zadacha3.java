import java.util.Scanner;
import java.util.Random;
/*
Третья и четвертая задача вместе. Сорри.
 */
public class zadacha3 {
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
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = randon.nextInt(max + 1 - min) + min;
        }

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[maxIndex] > array[i - 1]) {
                    maxIndex = maxIndex;
                } else {
                    maxIndex = i - 1;
                }
            }
        }

        for (int a : array) {
            System.out.print( a + " ");
        }
        System.out.println();
        System.out.println("Индекс максимального элемента - " + maxIndex);
        System.out.println("Максимальный элемент массива - " + array[maxIndex]);

        for (int i = 0; i < array.length; i++){

            for(int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        for (int a : array) {
            System.out.print( a + " ");
        }
        System.out.println();
        System.out.println("Индекс максимального элемента - " + array.length);
        System.out.println("Максимальный элемент массива - " + array[array.length-1]);
    }
}

/* Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Определите какой элемент
является в этом массиве максимальным и сообщите его индекс

Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Выведите массив на экран,
после чего отсортируйте его с помощью сортировки «пузырьком» и
выведите уже отсортированный массив

*/


