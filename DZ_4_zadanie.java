// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DZ_4_zadanie {
    public static void main(String[] args) throws IOException {
        int[] arg = { 5, 10, -5, 0, -100, 50, 7, 15, 25 };
        System.out.println(Arrays.toString(arg));
        //Logger logger1 = Logger.getAnonymousLogger();
        //FileWriter fileWriter = new FileWriter("test.txt");
        Logger logger1 = Logger.getLogger(DZ_4_zadanie.class.getName());
        FileHandler fn = new FileHandler("log.txt");
        logger1.addHandler(fn);
        SimpleFormatter sFormat = new SimpleFormatter();
        fn.setFormatter(sFormat);
        logger1.log(Level.INFO, "Test Log");
        //String happy = "sdf";
        //logger1.info(happy);
        //fileWriter.write(happy);
        //fileWriter.close();
        for (int i = 0; i < arg.length; i++) {
            for (int j = 1; j < arg.length; j++) {
                if (arg[j] < arg[j - 1]) {
                    int temp = arg[j];
                    arg[j] = arg[j - 1];
                    arg[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arg));
    }
}