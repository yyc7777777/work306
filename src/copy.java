import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("最长的电影.mp3");
        FileOutputStream fos = new FileOutputStream("gai.mp3");

        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
            System.out.println(b);
        }
        fis.close();
        fos.close();
    }
}
