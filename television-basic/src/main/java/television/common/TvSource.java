package television.common;

public interface TvSource {
    void tuneChannel(int channel);

    interface Provider {
        TvSource tvSource();
    }
}
