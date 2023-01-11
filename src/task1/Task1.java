package task1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/volodymyr/Desktop/modul10/src/task1/file.txt"));

            String regex1 = "/^(\\(\\d{3}\\))|(\\d{3}-)\\d{3}-\\d{4}$";
            String regex2 = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.matches(regex1) || line.matches(regex2)) {
                    System.out.println(line);
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
