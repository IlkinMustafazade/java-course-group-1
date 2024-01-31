package lesson29javainputoutput.fileoutputstream.example1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File("test.txt");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(74);
            fileOutputStream.write(65);
//            fileOutputStream.write(86);
//            fileOutputStream.write(65);
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
