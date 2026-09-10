import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void divide(int a,int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException error) {
            System.out.println("除数不能为0");
        }
    }
    public static void main(String[] args) {
        Path path = Path.of("data", "message.txt");
        try {
            Files.writeString(path, "wusion\njava\nfile\n");
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
