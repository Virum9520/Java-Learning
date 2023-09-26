import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class Advanced_java {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Virum");
        students.add(1,"Ranka");
        students.addAll(students);

        for (String i: students) {
            System.out.print(i+",");
        }
        System.out.println(students);
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yy");
        String date1 = dt.format(df);
        System.out.println(date1);
    }

}
