// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class DZ_1_zadanie {
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int val = inputRead.nextInt();
        int num = 1;
        int res = 1;
        while (num != val) {
            res = res * (num + 1);
            num++;
        }
        System.out.println(res);
    }
}