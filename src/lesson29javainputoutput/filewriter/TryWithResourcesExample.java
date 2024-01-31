package lesson29javainputoutput.filewriter;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter(PathData.MY_STUDENTS_CONTACT_FILE.getPath(), true)) {
            fileWriter.write("Axundov Samir:+994552225566\n");
            fileWriter.write("Zamanov Zamin:+994506665555\n");
            fileWriter.write("Asgarov Ilkin:+994508883322\n");
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
