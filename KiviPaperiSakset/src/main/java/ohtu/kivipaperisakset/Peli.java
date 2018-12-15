package ohtu.kivipaperisakset;

public class Peli {
    private KPS peli;
    
    public Peli(KPS peli){
        this.peli=peli;
    } 
    
    public static Peli getVsTekoaly(){
        return new Peli(new KPSTekoaly());
    }
    
    public static Peli getVsParempiTekoaly(){
        return new Peli(new KPSParempiTekoaly());
    }
    
    public static Peli getVsPelaaja(){
        return new Peli(new KPSPelaajaVsPelaaja());
    }
    
    public void pelaa(){
        this.peli.pelaa();
    }
}
