package lesson29javainputoutput.task;

public enum Suffix {
    TEXT(".txt");

    private final String text;

    Suffix(String text) {
        this.text = text;

    }

    public String getText() {
        return text;
    }
}
