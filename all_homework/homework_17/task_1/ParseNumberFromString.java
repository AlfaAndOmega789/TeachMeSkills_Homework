package all_homework.homework_17.task_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseNumberFromString {
    public static void main(String[] args) {
        String str = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(str);

        if(matcher.find()){
            System.out.println("All number: " + matcher.group());
        }
    }
}
