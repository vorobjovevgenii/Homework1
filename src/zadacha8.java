import java.util.Scanner;
public class zadacha8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String string = scanner.nextLine();

        System.out.print("Введие символ - ");
        String symbol = scanner.next();
        char symbolChar = symbol.charAt(0);

        int counter = 0;
        char[] array = string.toCharArray();
        for (char i : array){
            if (i == symbolChar){
                counter++;
            }
        }
        System.out.println("Ответ: " + counter);
    }
}

/*
Написать программу, в которой вводятся с клавиатуры сперва строка,
 а потом символ. После чего в консоль выводится количество вхождений
  символа в строку. Например, строка «Java 11», символ «a», результат: 2

 */
