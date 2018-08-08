package television.common;

public class TV {
    private final TvSource source;

    public TV(TvSource source) {
        this.source = source;
    }

    public void turnOn() {
        System.out.println("Turning on the TV");
        this.source.tuneChannel(42);
    }

    public interface Provider extends TvSource.Provider {
        default TV tv() {
            return new TV(tvSource());
        }
    }
}
