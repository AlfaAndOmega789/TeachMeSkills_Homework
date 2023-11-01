package all_homework.homework_17.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String reg = "\\b[A-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(reg);

        Matcher m = pattern.matcher(reader.readLine());

        while (m.find()) {
            System.out.println(m.group());
        }

        reader.close();
    }
}
