package lesson36stream.intro.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamExample2 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("Hi");
        wordList.add("Hello");
        wordList.add("Bye");
        wordList.add("GoodBye");
        System.out.println(wordList);
        List<Integer> lengthOfWordList = wordList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengthOfWordList);
    }
}
