import java.util.Arrays;

public class VareLager{
    private Vare [] vareTabel;
    private int antVarer;

    VareLager(){
        vareTabel=new Vare[20];
        antVarer=0;
    }

    public Vare[] getVareTabel() {
        return vareTabel;
    }

    public int getAntVarer() {
        return antVarer;
    }


    public void indsaetVare(int vNr, String vNavn, int antPaaLager, double stkPris){
        vareTabel[antVarer]=new Vare(vNr,vNavn,antPaaLager,stkPris);
        antVarer++;
    }

    public void indsaetVare(Vare v){
        vareTabel[antVarer]=v;
        antVarer++;
    }

    public void setNyPrisVare(int vNr,double nyPris){
        boolean fundet=false;
        for(int i=0;i<antVarer && fundet==false;i++){
            if(vNr==vareTabel[i].getVareNr()) {
                vareTabel[i].setStkPris(nyPris);
                fundet=true;
            }
        }
    }

    public void optaelAntal(int vNr,int antal){
        boolean fundet=false;
        for(int i=0;i<antVarer && fundet==false;i++){
            if(vNr==vareTabel[i].getVareNr()) {
                vareTabel[i].tilfoejAntal(antal);
                fundet=true;
            }
        }
    }

    public void fjernAntal(int vNr,int antal){
        boolean fundet=false;
        for(int i=0;i<antVarer && fundet==false;i++){
            if(vNr==vareTabel[i].getVareNr()) {
                vareTabel[i].fjernAntal(antal);
                fundet=true;
            }
        }
    }


    public Vare hentVareOpl(int vNr) {
        Vare v=null;
        for(int i=0;i<antVarer;i++){
            if(vNr==vareTabel[i].getVareNr()) {
                return vareTabel[i];
            }
        }
        return v;
    }

    public Vare hentVareIndex(int index) {
        if (index<antVarer)
            return vareTabel[index];
        else
            return null;
    }

    @Override
    public String toString() {
        return "VareLager{" +
                "vareTabel=" + Arrays.toString(vareTabel) +
                ", antVarer=" + antVarer +
                '}';
    }
}
