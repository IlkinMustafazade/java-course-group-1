package lesson29javainputoutput.task;

import java.io.File;

public class CreateFolder {
        public static File createFolder(String folderName) {
        File file = new File("/C:/Users/User/OneDrive/Desktop/" + folderName);
        if (!file.exists()) {
            file.mkdir();
            return file;
        }
        return file;
    }
}
