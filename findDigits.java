import java.io.*;

/*
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String [] buff = line.split(" ");
                for (String s : buff) {
                    if (s.matches("\\S*\\d+\\S*")) fileWriter.write(s + " ");
                }
            }
        }
    }
}