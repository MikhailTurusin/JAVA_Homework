// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DZ_8_zadanie {
    public static void main(String[] args) {
        Map<String, String> telephoneDirectory = new HashMap<>();
        // telephoneDirectory.put("Иванов", "+79000000000");
        // telephoneDirectory.put("Петров", "+79110000000");
        // telephoneDirectory.put("Сидоров", "+7912000000");
        // telephoneDirectory.put("Иванов", "+79000000001");
        // telephoneDirectory.put("Иванов", "+79000000002");
        // telephoneDirectory.put("Васильев", "+7913000000");

        telephoneDirectory.put("+79000000000", "Иванов");
        telephoneDirectory.put("+79110000000", "Петров");
        telephoneDirectory.put("+79120000000", "Сидоров");
        telephoneDirectory.put("+79000000001", "Иванов");
        telephoneDirectory.put("+79000000002", "Иванов");
        telephoneDirectory.put("+79130000000", "Васильев");

        ArrayList<String> myList = new ArrayList<>(Arrays.asList());
        String temp = "Иванов";
        for (Map.Entry<String, String> entry : telephoneDirectory.entrySet()) {
            String telefon = entry.getKey();
            String lastName = entry.getValue();

            if (lastName.equals("Иванов")) {
                myList.add(telefon);
            }
        }
        System.out.println(temp + " " + myList);

        telephoneDirectory.remove("+79000000000");
        telephoneDirectory.remove("+79000000001");
        telephoneDirectory.remove("+79000000002");

        for (Map.Entry<String, String> entry : telephoneDirectory.entrySet()) {
            String telefon = entry.getKey();
            String lastName = entry.getValue();

            System.out.println(lastName + " " + "[" + telefon + "]");
        }
    }
}
