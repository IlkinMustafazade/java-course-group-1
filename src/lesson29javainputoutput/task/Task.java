package lesson29javainputoutput.task;


import java.io.File;
import java.util.*;

import static lesson29javainputoutput.task.CreateFolder.createFolder;

public class Task {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter The folder name for create new folder:");
            String folderName = scanner.next();
            File folder = createFolder(folderName);

            System.out.println("How many numbers do you want to write to the file?");
            int size = scanner.nextInt();
            System.out.println("Enter the number for generate:");
            int randomNumber = scanner.nextInt();
            System.out.println("Enter fileName:");
            String inputFileName = scanner.next();

            String numbersFileName = folder + File.separator + inputFileName + Suffix.TEXT.getText();
            int[] arrayList = UtilArray.arrayList(size, randomNumber);
            System.out.println("********************* NUMBERS *********************");
            WriteAndReadFile.fileWriter(arrayList, numbersFileName);

            int[] numbers = WriteAndReadFile.fileReader(numbersFileName, size);
            int[] evenNumbers = UtilArray.evenNumbers(numbers);
            int[] oddNumbers = UtilArray.oddNumbers(numbers);

            System.out.println("Enter the file name for odd Numbers");
            String oddNumFileName = scanner.next();
            String pathOddNum = folder + File.separator + oddNumFileName + Suffix.TEXT.getText();
            System.out.println("********************* ODD NUMBERS *********************");
            WriteAndReadFile.fileWriter(oddNumbers, pathOddNum);

            System.out.println("Enter the file name for even Numbers");
            String evenNumFileName = scanner.next();
            String pathEvenNum = folder + File.separator + evenNumFileName + Suffix.TEXT.getText();
            System.out.println("********************* EVEN NUMBERS *********************");
            WriteAndReadFile.fileWriter(evenNumbers, pathEvenNum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
