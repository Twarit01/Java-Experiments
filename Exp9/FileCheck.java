import java.io.File;
public class FilePermission {
    public static void main(String[] args) {
        File file = new File("example2.txt"); 
        if (file.exists()) {
            System.out.println("Before changing permissions:");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);
            System.out.println("\nAfter changing permissions:");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } 
        else {
            System.out.println("File 'example2.txt' does not exist.");
        }
    }
}



