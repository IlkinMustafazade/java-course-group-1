package lesson29javainputoutput.task;


import java.io.*;
import java.util.Scanner;

public class WriteAndReadFile {

    public static void fileWriter(int[] arrayList, String path) throws Exception {
        FileWriter fileWriter = new FileWriter(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int num : arrayList) {
                if (num == 0)
                    continue;
                System.out.print(num + " | ");
                bufferedWriter.write(String.valueOf(num));
                bufferedWriter.newLine();
            }
            System.out.println();
        }
    }

    public static int[] fileReader(String path, int size) {
        int[] array = new int[size];
        int count = 0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                array[count] = Integer.parseInt(line);
                count++;
            }
            return array;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
