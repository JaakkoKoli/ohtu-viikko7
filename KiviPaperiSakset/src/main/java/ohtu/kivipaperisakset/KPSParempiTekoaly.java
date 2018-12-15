package ohtu.kivipaperisakset;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS{
    private TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    String tokanSiirto() {
        return tekoaly.annaSiirto();
    }
}
