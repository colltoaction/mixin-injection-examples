package television.common;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TVTest {
    @Test
    public void testWithProvider() {
        TvSource source = mock(TvSource.class);
        TV.Provider provider = new TV.Provider() {
            @Override
            public TvSource tvSource() {
                return source;
            }
        };
        provider.tv().turnOn();
        Mockito.verify(source, times(1)).tuneChannel(42);
    }
}