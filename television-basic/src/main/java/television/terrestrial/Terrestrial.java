package television.terrestrial;

import television.common.TvSource;

public class Terrestrial implements TvSource {
    @Override
    public void tuneChannel(int channel) {
        System.out.printf("Adjusting satellite dish frequency to channel %d\n", channel);
    }

    public interface Provider extends TvSource.Provider {
        @Override
        default TvSource tvSource() {
            return new Terrestrial();
        }
    }
}
