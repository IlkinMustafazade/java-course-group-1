package lesson22oop4part2.diamondProblem;

public class MusicianActor implements Musician,Actor{
    @Override
    public void play() {
        System.out.println("MusicianActor is Playing");
    }
}
