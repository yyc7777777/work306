import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("qqq.txt");
        int a =fr.read();
        System.out.println((char)a);
        int b =fr.read();
        System.out.println((char)b);
        char c =(char)fr.read();
        System.out.println(c);
        int d =fr.read();
        System.out.println(d);
    }
}
