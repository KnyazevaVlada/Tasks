import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
Заменить все числа на слова используя словарь map.
Результат вывести на экран
 */

public class NumbersReplacement {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    line = line.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(line);
            }
        }
    }
}