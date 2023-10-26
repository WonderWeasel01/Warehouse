import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //1. Opret et objekt af klassen VareLager
        VareLager VL1 = new VareLager();


        //2. Indsæt 10 varer i lageret. Vis både  anvendelse af
        //public void indsaetVare(int vNr, String vNavn, int antPaaLager, double stkPris) og
        //public void indsaetVare(Vare v)
        VL1.indsaetVare(2,"Skjorte",100,150);
        VL1.indsaetVare(3,"højre sok",300,20);
        VL1.indsaetVare(4,"venstre sok",301,20);
        VL1.indsaetVare(5,"højre sko",200,250);
        VL1.indsaetVare(6,"venstre sko",202,250);
        VL1.indsaetVare(7,"højre handske",1000,50);
        VL1.indsaetVare(8,"venstre handske",1000,50);
        VL1.indsaetVare(9,"jakke",250,250);
        VL1.indsaetVare(10,"frakke",150,350);

        //3. Udskriv varelageret ved kald af funktionen
        // public static void udskrivLager(VareLager lager)
        System.out.println("Opgave 3");
        udskrivLager(VL1);

        //4. Vis kald af metoden public void setNyPrisVare(int vNr,double nyPris)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        VL1.setNyPrisVare(10, 250);
        System.out.println("Opgave 4");
        udskrivLager(VL1);

        //5. Vis kald af metoden public void optaelAntal(int vNr,int antal)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        VL1.optaelAntal(2,20);
        System.out.println("Opgave 5");
        udskrivLager(VL1);

        //6. Vis kald af metoden public void fjernAntal(int vNr,int antal)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        VL1.fjernAntal(10,100);
        System.out.println("Opgave 6");
        udskrivLager(VL1);

        //7. Vis kald af metoden public Vare hentVareOpl(int vNr)
        //Udskriv herefter vareoplysningerne på varen med dette varenummer vNr
        System.out.println("Opgave 7");
       Vare v2 = VL1.hentVareOpl(9);
        System.out.println(v2);

        //8. Vis kald af metoden public Vare hentVareIndex(int index)
        //Udskriv herefter vareoplysningerne på vare med dette indexnummer i vareTabellen
        System.out.println("Opgave 8");
        Vare v3 = VL1.hentVareIndex(0);
        System.out.println(v3);

        //9. Tilret opgave 2 så vareoplysningerne indlæses fra en tekstfil
        //For det første skal der oprettes en .txt fil med vareoplysninger
        //Herefter skal der implementeres en funktion public static void indlaesFraFil(VareLager lager)
        //som kan indlæse data fra .txt filen i varelageret lager
        //Vis kald af denne funktionen og udskriv herefter varelageret

        //10. Implementer en funktion public static void udskrivTilFil(VareLager lager)
        //Ved kald af funktionen skal alle vareoplysningerne udskrives til en .txt fil

    }

    public static void udskrivLager(VareLager lager){
        for(int i=0;i<lager.getAntVarer();i++){
            Vare v=lager.hentVareIndex(i);
            System.out.println(v.getVareNr()+" "+v.getVareNavn()+" "+v.getAntalPaaLager()+" "+v.getStkPris());
        }
    }
}