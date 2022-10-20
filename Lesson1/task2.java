import java.util.Scanner;
import java.time.LocalDateTime;

// В зависимости от текущего времени вызывать сообщение 
//доброе утро, добрый день, добрый вечер или доброй ночи

public class task2 {

    LocalDateTime ldt = LocalDateTime.now();
    Integer currentTime = ldt.getHour();

    public static void main(String[] args) {
        task2 task2 = new task2();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.next();
        iScanner.close();
        task2.getMSGtime(name);
        System.out.printf("Текущее время: %s", task2.currentTime);
    }

    public void getMSGtime(String name) {
        if (currentTime >= 5 && currentTime < 11) {
            System.out.printf("Доброе утро, %s!\n", name);
            }
        if (currentTime >= 11 && currentTime < 16) {
            System.out.printf("Добрый день, %s!\n", name);
            }
        if (currentTime >= 16 && currentTime < 23) {
            System.out.printf("Добрый вечер, %s!\n", name);
            }
        if (currentTime >= 23 && currentTime < 5) {
            System.out.printf("Доброй ночи, %s!\n", name);
            }
    }
}
