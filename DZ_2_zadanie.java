// Вывести все простые числа от 1 до 1000

public class DZ_2_zadanie {
    public static void main(String[] args) {
        boolean check;
        for (int i = 2; i < 1000; i++) {
            check = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}