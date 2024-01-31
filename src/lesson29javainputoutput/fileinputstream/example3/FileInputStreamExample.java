package lesson29javainputoutput.fileinputstream.example3;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(PathData.MY_NOTE_FILE.getPath());
            int value;
            while ((value = fileInputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(fileInputStream)) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
