package lesson29javainputoutput.bufferedwriter;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathData.MY_STUDENTS_CONTACT_FILE.getPath(), true))) {
            bufferedWriter.write("Mammadov Vuqar:+994558555858");
            bufferedWriter.newLine();
            bufferedWriter.write("Qasimov Ayyub:+994505858585");
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
