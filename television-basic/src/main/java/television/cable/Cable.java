package television.cable;

import television.common.TvSource;

public class Cable implements TvSource {
    @Override
    public void tuneChannel(int channel) {
        System.out.printf("Changing digital signal to channel %d\n", channel);
    }

    public interface Provider extends TvSource.Provider {
        @Override
        default TvSource tvSource() {
            return new Cable();
        }
    }
}
