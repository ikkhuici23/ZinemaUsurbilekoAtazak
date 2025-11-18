import java.util.ArrayList;

// Nola erabili debugerra:
// -----------------------
//
// Java proiektu batean oso garrantzitsua da debugerra erabiltzea. Debugerra programatzaileentzako
// oso tresna erabilgarria da, kodearen exekuzioa pausatu, aldagaiak ikusi eta balioak aldatu ahal
// izateko, adibidez. Java proiektu batean debugerra erabiltzeko hainbat pauso jarraitu behar dira
// lehenengo:
//
// 1. Aztertu zer break-point jarri nahi dituzun kodean. Break-point-ak kodearen exekuzioan
//    gelditzeko puntuak dira, non aldagaiak ikusi eta balioak aldatu ahal izango dituzu. Visual
//    Studio Code-n break-point-ak jarri nahi dituzun lerroetan klik egin dezakezu. Honek puntu
//    gorri bat jarriko du lerro horretan.
//
// 2. Exekutatu programa debug moduan. Visual Studio Code-n, "Run and Debug" ikonoa sakatu
//    (alboko barra ezkerrean dagoena) eta "Run and Debug" aukeratu. Honek, programa debug moduan
//    exekutatuko du eta break-point-ak aurkitzen direnean geldituko da.
//
// 3. Kodearen exekuzioa pausatu denean, aldagaiak ikusi eta balioak aldatu ahal izango dituzu.
//    Aldagaiak ikusteko, "Variables" atala erabil dezakezu debugerako interfazean. Aldagai baten
//    balioa aldatu nahi baduzu, balioaren gainean klik egin eta nahi duzun balioa sartu.
//
// 4. Kodearen exekuzioa jarraitu nahi baduzu, "Continue" botoia sakatu dezakezu debugerako
//    interfazean. Honek, hurrengo break-point-era edo programaren amaierara arte exekutatuko du.
//
// 5. Debugerra amaitu nahi baduzu, "Stop" botoia sakatu dezakezu debugerako interfazean.

// Nola sortu Javadoc dokumentazioa:
// ---------------------------------
//
// Proiektu karpeta nagusi barruan urrengo komandoa terminalean sartu:
//
// & "C:\Program Files\Java\jdk-22\bin\javadoc.exe" -d docs .\src\SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa.java
//
// Komando honek "docs/" izeneko karpeta batean Javadoc dokumentazioa sortuko du. Dokumentazio honek
// "SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa.java" fitxategian dauden Javadoc
// iruzkinak irakurriko ditu eta HTML fitxategi moduan formateatuko ditu. Sortutako dokumentazioa
// nabigatzaile batean ikusi nahi baduzu, "docs/index.html" fitxategia irekiz, biztaratu ahal duzu.

/**
 * Softwarearen garapena, eskakizun operazionalak eta programa informatikoak zer diren
 * azaltzen dituen klasea.
 */
public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    /** ANSI kolore gorria. */
    public static final String RED = "\u001b[31m";

    /** ANSI kolore berdea. */
    public static final String GREEN = "\u001b[32m";

    /** ANSI kolore horia. */
    public static final String YELLOW = "\u001b[33m";

    /** ANSI reset-a. */
    public static final String RESET = "\u001b[0m";

    /** Eskakizun operazionalak azalpeneko String ArrayList-a. */
    public static final ArrayList<String> eoAzalpenak = new ArrayList<>();

    /** Programa informatikoa azalpeneko String ArrayList-a. */
    public static final ArrayList<String> piAzalpenak = new ArrayList<>();

    // Azalpenak gehitu `eoAzalpenak`.
    static {
        eoAzalpenak.add("Eskakizun operazionalak sistema edo software baten funtzionamendu beharrak eta baldintzak zehazten dituzten dokumentuak dira.");
        eoAzalpenak.add("Helburua sistema edo softwareak bezeroaren beharrak modu eraginkorrean asetzea da.");
        eoAzalpenak.add("Eskakizun operazionalek funtzionalitate zehatzak, errendimendu baldintzak, segurtasun neurriak eta erabilgarritasun eskakizunak barne hartzen dituzte.");
    }

    // Azalpenak gehitu `piAzalpenak`.
    static {
        piAzalpenak.add("Programa informatikoa software aplikazio edo sistemak dira, ordenagailuetan exekutatzeko diseinatuta daudenak.");
        piAzalpenak.add("Programa informatikoak hainbat helburu izan ditzakete, hala nola datuak prozesatzea, komunikazioa erraztea edo entretenimendua eskaintzea.");
        piAzalpenak.add("Programa informatikoak hainbat kategoria ditu, hala nola sistema eragileak" + RED + " (Windows, macOS, ...)" + RESET + ", aplikazioak" + RED + " (Firefox, Steam, ...)" + RESET + " eta utilitate programak" + RED + " (Microsot Office, CPU-Z, ...)." + RESET);
        piAzalpenak.add("Garapen prozesua normalean diseinua, programazioa, probak eta mantentze-lanak barne hartzen ditu.");
        piAzalpenak.add("Programa informatikoaren kalitatea erabiltzailearen esperientzian eta funtzionalitatean oinarritzen da.");
    }

    /**
     * Main metodoa.
     * @param args komando lerroko argumentuak.
     */
    public static void main(String[] args) {
        // Eskakizun operazionaleko azalpen titulua.
        final String EO_TITULUA = "Zer dira eskakizun operazionalak?";

        System.out.println(GREEN + EO_TITULUA + RESET);
        System.out.println("-".repeat(EO_TITULUA.length()));
        System.out.println();

        for (int i = 0; i < eoAzalpenak.size(); i++) {
            System.out.println(YELLOW + (i + 1) + RESET + ". " + eoAzalpenak.get(i));
        }

        System.out.println();

        // Programa informatikoko azalpen titulua.
        final String PI_TITULUA = "Zer da programa informatikoa?";

        System.out.println(GREEN + PI_TITULUA + RESET);
        System.out.println("-".repeat(PI_TITULUA.length()));
        System.out.println();

        for (int i = 0; i < piAzalpenak.size(); i++) {
            System.out.println(YELLOW + (i + 1) + RESET + ". " + piAzalpenak.get(i));
        }
    }
}
