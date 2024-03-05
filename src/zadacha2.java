import java.util.Scanner;
import java.util.Random;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randon = new Random();
        System.out.println("Введите размер массива: ");
        int length = scanner.nextInt();
        while (length < 1){
            System.out.println("Размер массива должен быть больше 0: ");
            System.out.println("Введите размер массива: ");
            length = scanner.nextInt();
        }
        System.out.println("Введите нижний диапазон значений: ");
        int min = scanner.nextInt();
        System.out.println("Введите верний диапазон значений: ");
        int max = scanner.nextInt();
        while (max < min){
            System.out.println("Неверный диапазон.");
            System.out.println("Введите нижний диапазон значений: ");
            min = scanner.nextInt();
            System.out.println("Введите верний диапазон значений: ");
            max = scanner.nextInt();
        }

        int [] array = new int[length];

        for(int i = 0; i < array.length; i++){
            array[i] = randon.nextInt(max + 1 - min) + min;
        }

        for(int a : array){
            System.out.print( a + " ");
        }
    }
}

/*
Попросить пользователя ввести с клавиатуры сперва размер
массива, потом нижний диапазон значений и верхний. После
чего создать массив размером, который ввел пользователь
и заполнить его случайными числами из диапазона, введенного
пользователем. Если пользователь ввел неверные значения
(отрицательный размер массива, нижняя граница диапазона
больше верхнего и т.д.) попросить его ввести значение ещё
раз и перезаписать старое значение новым. Вывести массив
на экран (Для этого удобнее пользоваться не println, а print)

 */