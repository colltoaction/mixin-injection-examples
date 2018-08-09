package television.common;

public class TV {
    private final TvSource source;
    private final CathodeRayTube cathodeRayTube;

    public TV(TvSource source, CathodeRayTube cathodeRayTube) {
        this.source = source;
        this.cathodeRayTube = cathodeRayTube;
    }

    public void turnOn() {
        System.out.println("Turning on the TV");
        this.source.tuneChannel(42);
        this.cathodeRayTube.beam();
    }

    public interface Provider extends TvSource.Provider, CathodeRayTube.Provider {
        default TV tv() {
            return new TV(tvSource(), cathodeRayTube());
        }
    }
}
