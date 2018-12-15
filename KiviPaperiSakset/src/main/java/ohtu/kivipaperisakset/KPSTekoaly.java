package ohtu.kivipaperisakset;

public class KPSTekoaly  extends KPS{
    private final Tekoaly tekoaly = new Tekoaly();

    @Override
    String tokanSiirto() {
        return tekoaly.annaSiirto();
    }
}