import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
�������� ��� ����� �� ����� ��������� ������� map.
��������� ������� �� �����
 */

public class NumbersReplacement {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "����");
        map.put(1, "����");
        map.put(2, "���");
        map.put(3, "���");
        map.put(4, "������");
        map.put(5, "����");
        map.put(6, "�����");
        map.put(7, "����");
        map.put(8, "������");
        map.put(9, "������");
        map.put(10, "������");
        map.put(11, "�����������");
        map.put(12, "����������");
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