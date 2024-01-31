package lesson22oop4part2.diamondProblem;

public interface Actor extends Artist {
    default void play() {
        System.out.println("Actor is playing");
    }
}
