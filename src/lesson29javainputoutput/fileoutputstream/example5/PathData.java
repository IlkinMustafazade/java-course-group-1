package lesson29javainputoutput.fileoutputstream.example5;

import java.io.File;

public enum PathData {
    MY_FOLDER_PATH("/C:/Users/User/OneDrive/Desktop/MyFolder"),
    MY_NOTE_FILE(MY_FOLDER_PATH.getPath() + File.separator + "MyNotes.txt"),
    MY_STUDENTS_CONTACT_FILE(MY_FOLDER_PATH.getPath() + File.separator + "MyStudentsContact.txt");

    PathData(String path) {
        this.path = path;
    }

    private final String path;

    public String getPath() {
        return path;
    }
}
