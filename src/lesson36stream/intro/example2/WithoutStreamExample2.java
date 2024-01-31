package lesson36stream.intro.example2;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample2 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("Hi");
        wordList.add("Hello");
        wordList.add("Bye");
        wordList.add("GoodBye");
        System.out.println(wordList);

        List<Integer> lengthOfWordList = new ArrayList<>();

        for (String word : wordList) {
            lengthOfWordList.add(word.length());
        }
        System.out.println(lengthOfWordList);
    }
}
