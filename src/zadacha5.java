import java.util.Random;
import java.util.Scanner;

public class zadacha5 {
    public static void main(String[] args) {
        int length = 19;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] array = new int [length];
        int max = 100;
        int min = 1;

        for (int i = 0; i < array.length; i++){
            array [i] = random.nextInt(max - min) + min;

        }

        System.out.print("Введите число N - " );
        int n = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            if (array[i] == n) {
                System.out.println("В массиве число " + n + " с индексом - " + i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
/*
Создать и проинициализировать массив из 20 элементов.
Ввести с клавиатуры число n и найти, есть ли оно в массиве,
и, если есть, вывести его индекс на экран. Использовать
линейный поиск

 */
