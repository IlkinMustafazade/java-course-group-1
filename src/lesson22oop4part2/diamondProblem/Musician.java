package lesson22oop4part2.diamondProblem;

public interface Musician extends Artist{
    default void play() {
        System.out.println("Musician is playing");
    }
}
