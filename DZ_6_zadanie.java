
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

public class DZ_6_zadanie {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 15, 17, 20, 22, 26, 33, 34, -49));

        int min = myList.get(0);
        int max = myList.get(0);
        int count = 0;
        double sum = 0;
        for (Integer i : myList) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            count++;
            sum += i;
        }

        System.out.println("Минимальное число в списке: " + min);
        System.out.println("Максимальное число в списке: " + max);
        System.out.println("Среднее арифметическое число в списке: " + sum/count);
        // System.out.println(Collections.min(myList));
        // System.out.println(Collections.max(myList));

        Iterator<Integer> col = myList.iterator();
        while (col.hasNext()) {
            Integer el = col.next();
            if (el % 2 == 0) {
                col.remove();
            }
        }
        System.out.println();
        System.out.println("Удаляем четные числа: ");
        System.out.println(myList);
    }

}
