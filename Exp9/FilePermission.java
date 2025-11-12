import java.io.File;
public class FilePermission {
    public static void main(String[] args) {
        File file = new File("example.txt"); 
        boolean readable = file.setReadable(true);
        boolean writable = file.setWritable(true);
        boolean executable = file.setExecutable(false);

        System.out.println("Readable: " + readable);
        System.out.println("Writable: " + writable);
        System.out.println("Executable: " + executable);
    }
}