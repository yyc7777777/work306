import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) throws IOException {
        //demo();
        FileInputStream fis = new FileInputStream("xxx.txt");
        int x;
        while ((x=fis.read())!=-1){
            System.out.println(x);
        }
        fis.close();
    }

    public static void demo() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        int a = fis.read();
        System.out.println(a);
        int  b = fis.read();
        System.out.println(b);
        int c = fis.read();
        System.out.println(c);
        int d = fis.read();
        System.out.println(d);
        int e = fis.read();
        System.out.println(e);
    }
}
