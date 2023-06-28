import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class DZ_5_zadanie {
    public static void main(String[] args) throws IOException{
        Scanner inputRead = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int val1 = inputRead.nextInt();
        System.out.printf("Введите второе число: ");
        int val2 = inputRead.nextInt();
        System.out.println("1. -");
        System.out.println("2. +");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.printf("Выберите нужное действие: ");
        int res = inputRead.nextInt();
        if (res > 4 | res < 1) {
            System.out.println("Нужно выбрать цифру от 1 до 4");
        } else {
            switch (res) {
                case (1):
                    int res1 = val1 - val2;
                    System.out.print("Результат: ");
                    System.out.println(res1);
                    break;
                case (2):
                    int res2 = val1 + val2;
                    System.out.print("Результат: ");
                    System.out.println(res2);
                    break;
                case (3):
                    int res3 = val1 * val2;
                    System.out.print("Результат: ");
                    System.out.println(res3);
                    break;
                case (4):
                    double res4 = (double) val1 / val2;
                    System.out.print("Результат: ");
                    System.out.println(res4);
                    break;
            }
        }
        Logger logger1 = Logger.getAnonymousLogger();
        FileWriter fileWriter = new FileWriter("log.txt");
        String happy = "Ok";
        logger1.info(happy);
        fileWriter.write(happy);
        fileWriter.close();
    }
}
