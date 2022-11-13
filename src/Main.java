import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ClassWork.main();

        // Level1:
        // С консоли считывается число.
        // Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        // если число не равно 0, тогда выведите три сообщения "ERROR"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Ошибок не обнаружено\n");
        } else {
            System.out.println("Ошибка\n");
        }

        // Level2:
        // Мартин играет в рулетку.
        // Он крутит ее два раза.
        // Если в первый раз выпадет 36 И во второй выпадет 17, то он выиграет джекпот.
        // Если в первый раз выпадет 36 ИЛИ во второй раз выпадет 17, то он выиграет маленький приз.
        // Если выпадет НЕ 36 И НЕ 17, то он все проиграет.
        // С консоли считывается два числа, первое число - сколько выпало на рулетке первый раз,
        // второе число - сколько выпало второй раз. Напишите, что выиграет Марин

        System.out.print("Введите что выпало в первый раз: ");
        int value1 = scanner.nextInt();
        System.out.print("Введите что выпало во второй раз: ");
        int value2 = scanner.nextInt();

        if (value1 == 36 && value2 == 17) {
            System.out.println("Джекпот!");
        } else if (value1 == 36 || value2 == 17) {
            System.out.println("Маленький приз");
        } else {
            System.out.println("Мартин все проиграл");
        }


    }
}