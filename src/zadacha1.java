import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        int [] array = new int [4];
        Random random = new Random ();
        for (int i = 0; i < 4; i++){
            array [i] = random.nextInt(90) + 10;
        }
        for (int j = 0; j < 4; j++){
            System.out.print(array[j] + " ");
        }
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]){
            System.out.print("Массив строго возрастающей последовательностью\n");
        } else {
            System.out.print("Нет, массив не строго возрастающей последовательностью");
        }
    }
}

/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку. Определить и вывести на экран
 сообщение о том, является ли массив строго возрастающей
 последовательностью
 */