package lesson29javainputoutput.fileoutputstream.example3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("test.txt");
            fileOutputStream = new FileOutputStream(file, true);
            byte[] bytes = {32, 74, 65, 86, 65};
            fileOutputStream.write(bytes);
            System.out.println("Success!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
