package lesson29javainputoutput.filewriter;

import com.sun.net.httpserver.Authenticator;
import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null; // give the reference null use this reference in finally block
        try {
            fileWriter = new FileWriter(PathData.MY_STUDENTS_CONTACT_FILE.getPath(), true);
            fileWriter.write("Aliyev Vali:+994552222222\n");
            fileWriter.write("Ahmadov Samad:+994553332233\n");
            fileWriter.write("Malikov Cahangir:+994504443322\n");
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(fileWriter)) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}

