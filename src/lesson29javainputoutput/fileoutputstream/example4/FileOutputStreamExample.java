package lesson29javainputoutput.fileoutputstream.example4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("test.txt");
            fileOutputStream = new FileOutputStream(file, true);
            String s = " Ilkin Mustafazada";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("Success!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
