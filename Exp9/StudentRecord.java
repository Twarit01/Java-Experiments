import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class StudentRecord{
    public static void main(String[] args) {
        String filename = "students.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("1, John, 8.65, A\n");
            bw.write("2, Alice, 9.12, B\n");
            bw.write("3, Bob, 7.45, C\n");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



