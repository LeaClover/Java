import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int a = 123;
        a = a-- - --a;
        System.out.println(a);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}