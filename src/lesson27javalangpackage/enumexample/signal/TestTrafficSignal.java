package lesson27javalangpackage.enumexample.signal;

public class TestTrafficSignal {
    public static void main(String[] args) {
        TrafficSignal[] signals = TrafficSignal.values();
        for (TrafficSignal signal : signals) {
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction());
        }
    }
}
