import java.util.Scanner;

public class zadacha9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        if (string.isEmpty()){
            System.out.println("Строка пуста. Введите строку: ");
            string = scanner.nextLine();
        }

        System.out.println("Введите символ, который нужно заменить: ");
        String simbolA = scanner.next();
        char a = simbolA.charAt(0);

        System.out.println("Введите символ, на который нужно заменить: ");
        String simbolB = scanner.next();
        char b = simbolB.charAt(0);

        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++){
            if (array[i] == a){
                array[i] = b;
            }
        }

        string = new String(array);
        System.out.println("Результат: " + string);
    }
}

/*
С клавиатуры вводится любая строка. Если она пустая, выводится
 сообщение с просьбой повторить ввод. Далее с клавиатуры вводятся
 два символа (a и b), после чего нужно вывести строку, в которой
 все символы a нужно заменить на символы b.
 Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
 */