import java.io.File;
public class FileCheck {
    public static void main(String[] args) {
        File file = new File("example.txt"); 
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }
}