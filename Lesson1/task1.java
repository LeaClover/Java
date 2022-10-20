import java.util.Scanner;

//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        task1 task1 = new task1();
        task1.getMSG(name);
        iScanner.close();
    }

    public void getMSG(String name) {
        System.out.printf("Привет, %s!", name);
    }
}
