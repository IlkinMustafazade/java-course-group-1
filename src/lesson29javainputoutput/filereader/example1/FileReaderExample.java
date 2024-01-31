package lesson29javainputoutput.filereader.example1;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader(PathData.MY_STUDENTS_CONTACT_FILE.getPath()))) {
            while (scanner.hasNextLine()) {
                System.out.println("Read Line: " + scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
