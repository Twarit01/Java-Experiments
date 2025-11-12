import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class ReadWrite {
    public static void main(String[] args) {
        String filename = "data.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is a sample text.");
            writer.close();
            FileReader reader = new FileReader(filename);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



