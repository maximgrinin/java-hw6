import java.util.Scanner;

public class ClassWork {
    public static void main() {
        //Вводится число, если оно больше-равно чем 5000, то написать "это уже город"
        //Если число меньше 5000, но больше-равно 500 жителей, то написать "Это поселок"
        //Если меньше 500 жителей, то это "село-деревня"
        //Усложнение: Если введено неверное значение, то написать "ERROR" < 0

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество жителей: ");
        int population = scanner.nextInt();

        if (population >= 5000) {
            System.out.println("Это уже город");
        } else if (population >= 500) {
            System.out.println("Это поселок");
        } else if (population > 0) {
            System.out.println("Это село-деревня");
        } else {
            System.out.println("Ошибка: Введите корректное значение");
        }

    }
}
