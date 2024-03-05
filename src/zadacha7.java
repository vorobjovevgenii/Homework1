import java.util.Scanner;
import java.util.Random;

public class zadacha7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива N -");
        int length = scanner.nextInt();
        while (length < 0){
            System.out.println("Массив должен быть положительным");
            System.out.println("Введите размер массива N -");
            length = scanner.nextInt();
        }

        System.out.println("Введите нижний диапазон - ");
        int min = scanner.nextInt();
        System.out.println("Введите верхний диапазон - ");
        int max = scanner.nextInt();

        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max + 1 - min) + min;
        }

        int temp;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - i - 1; j++){
                if(array [j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i : array){
            System.out.println(i + " ");
        }

        System.out.println("Введите искомое число");
        int k = scanner.nextInt();
        for (int i = 0; i < length; i++){
            if (array[i] == k){
                System.out.println("Индекс элемента: " + i);
                System.out.println("Количество шагов линейного поиска: " + i);
                break;
            }
        }

        int lowIndex = 0;
        int highIndex = array.length - 1;
        int counter = 0;

        while (lowIndex <= highIndex){
            counter++;
            int midindex = (lowIndex + highIndex) / 2;
            if (array[midindex] == k){
                System.out.println("Индекс элемента: " + midindex + ". Количество шагов двоичного поиска: " + counter);
                break;
            } else if (k < array[midindex]){
                highIndex = midindex - 1;
            } else if (k > array[midindex]){
                lowIndex = midindex + 1;
            }
        }


    }
}

/*
Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Отсортировать массив любым
алгоритмом. Вывести массив на экран, после чего ввести с клавиатуры
число k, найти индекс этого числа в массиве сперва линейным поиском,
потом двоичным и вывести на экран этот индекс, если число есть в массиве,
и количество «шагов», которое каждый алгоритм потратил на выполнение задачи.
Например:
Введите размер массива
9
Введите нижний диапазон
0
Введите верхний диапазон
10
Массив: 1, 2, 2, 3, 5, 6, 7, 8, 8
Введите искомое значение
3
Индекс элемента: 3
Линейный поиск: 4 шаг(-а)(-ов)
Двоичный поиск: 3 шаг(-а)(-ов)

 */