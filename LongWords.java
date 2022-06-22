import java.io.*;

/*
������� �����
� ����� main ������ ���������� �������� ���� � �����1, ������ - ���� � �����2.
����1 �������� �����, ����������� �������� ��� ��������� ������ (� ����� ����� ���� ��������� �����).
���, ��� �� ��������� � ������� ��� �������� ������, ������������ �� �������.
�������� � ���� ������ ����� ������� � ����2 �����, ����� ������� ������ ������ 6.
� ����� �����2 ������� �� ������ ����.
������� ������.
*/

public class Solution {
    public static void main(String[] args) {
        String line;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            while ((line = reader.readLine()) != null) {
                String [] buffer = line.split("\\s");
                for (String s : buffer) {
                    if (s.length() > 6) sb.append(s).append(",");
                }
            }
            writer.write(String.valueOf(sb.deleteCharAt(sb.length()-1)));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}