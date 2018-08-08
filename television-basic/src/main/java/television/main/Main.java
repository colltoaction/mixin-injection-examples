package television.main;

import television.cable.Cable;
import television.common.TV;
import television.terrestrial.Terrestrial;

class Main {
    public static void main(String[] args) {
        new MainContextForCable().tv().turnOn();
        new MainContextForTerrestrial().tv().turnOn();
    }

    private static class MainContextForCable implements TV.Provider, Cable.Provider {
    }

    private static class MainContextForTerrestrial implements TV.Provider, Terrestrial.Provider {
    }
}