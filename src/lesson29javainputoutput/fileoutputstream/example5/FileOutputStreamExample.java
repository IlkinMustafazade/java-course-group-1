package lesson29javainputoutput.fileoutputstream.example5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class FileOutputStreamExample {
//    public static final String MY_FOLDER_PATH = "/C:/Users/User/OneDrive/Desktop/MyFolder";
//    public static final String MY_JAVA_FILE_PATH = MY_FOLDER_PATH + File.separator + "MyJava.txt";

    public static void folder() {
        File file = new File(PathData.MY_FOLDER_PATH.getPath());
        {
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    public static void main(String[] args) {
        FileOutputStreamExample.folder();
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PathData.MY_NOTE_FILE.getPath(),
                    true);
            String s = "I love Java!!!";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(fileOutputStream)) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
