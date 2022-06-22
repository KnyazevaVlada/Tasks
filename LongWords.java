import java.io.*;

/*
Длинные слова
В метод main первым параметром приходит путь к файлу1, вторым - путь к файлу2.
Файл1 содержит слова, разделенные пробелом или переводом строки (в файле может быть несколько строк).
Все, что не относится к пробелу или переводу строки, разделителем не считать.
Записать в одну строку через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.
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