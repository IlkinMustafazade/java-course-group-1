package lesson29javainputoutput.fileinputstream.example1;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
//            fileInputStream = new FileInputStream(PathData.MY_FOLDER_PATH.getPath());
            fileInputStream = new FileInputStream(PathData.MY_NOTE_FILE.getPath());
            System.out.println("First Character: " + (char) fileInputStream.read());
            System.out.println("Second Character: " + (char) fileInputStream.read());
            System.out.println("Third Character: " + (char) fileInputStream.read());
            System.out.println("Fourth Character: " + (char) fileInputStream.read());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(fileInputStream)) {
                    fileInputStream.close();
                }
//                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
