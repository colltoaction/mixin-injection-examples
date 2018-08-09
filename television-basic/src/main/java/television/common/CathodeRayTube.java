package television.common;

public class CathodeRayTube {
    public void beam() {
        System.out.println("Beaming electrons to produce the TV image");
    }

    public interface Provider {
        default CathodeRayTube cathodeRayTube() {
            return new CathodeRayTube();
        }
    }
}
