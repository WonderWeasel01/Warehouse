public class Vare{
    private int vareNr;
    private String vareNavn;
    private int antalPaaLager;
    private double stkPris;


    Vare(int vareNr, String vareNavn, int antalPaaLager, double stkPris) {
        this.vareNr = vareNr;
        this.vareNavn = vareNavn;
        this.antalPaaLager = antalPaaLager;
        this.stkPris = stkPris;
    }

    public void setvaerdier(int vnr, String vnavn, int antal, double pris){
        vareNr=vnr;
        vareNavn=vnavn;
        antalPaaLager=antal;
        stkPris=pris;
    }

    public int getVareNr() {
        return vareNr;
    }

    public void setVareNr(int vareNr) {
        this.vareNr = vareNr;
    }

    public String getVareNavn() {
        return vareNavn;
    }

    public void setVareNavn(String vareNavn) {
        this.vareNavn = vareNavn;
    }

    public int getAntalPaaLager() {
        return antalPaaLager;
    }

    public void setAntalPaaLager(int antalPaaLager) {
        this.antalPaaLager = antalPaaLager;
    }

    public double getStkPris() {
        return stkPris;
    }

    public void setStkPris(double stkPris) {
        this.stkPris = stkPris;
    }

    @Override
    public String toString() {
        return "Vare{" +
                "vareNr=" + vareNr +
                ", vareNavn='" + vareNavn + '\'' +
                ", antalPaaLager=" + antalPaaLager +
                ", stkPris=" + stkPris +
                '}';
    }

    public void tilfoejAntal(int antal){
        antalPaaLager+=antal;
    }

    public void fjernAntal(int antal){
        antalPaaLager-=antal;
    }

    public void nyPris(double nyStkPris){
        stkPris=nyStkPris;
    }

    public double pris(int antal){
        return antal*stkPris;
    }

    public double rabatPris(int antal){
        if(antal>20)
            return antal*stkPris*0.85;
        else
            return antal*stkPris;
    }
}