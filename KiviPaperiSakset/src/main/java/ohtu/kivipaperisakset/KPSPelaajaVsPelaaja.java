package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja  extends KPS{

    @Override
    String tokanSiirto() {
        return scanNextLine();
    }
}