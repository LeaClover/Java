import java.util.Scanner;
import java.lang.Math;
// Реализовать функции возведения числа a в степень b

public class HWtask1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        HWtask1 hw = new HWtask1();
        System.out.printf("Введите число a: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Введите число b: ");
        double b = Double.parseDouble(iScanner.nextLine());
        double result = hw.getPower(a, b);
        hw.printResult(a, b, result);
        iScanner.close();
    }

    public double getPower(int a, double b) {
        return Math.pow(a, b);
    }

    public void printResult(int a, double b, double result) {
        System.out.printf("%d ^ %.2f = %.2f", a, b, result);
    }
}
