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
// 5. Step-into, Step-over eta Step-out funtzioak ere erabil ditzakezu kodearen exekuzioa pausatu,
//    lerro bakoitzean zehar nabigatzeko. "Step-into" botoia erabil dezakezu funtzio baten barruan
//    sartu nahi baduzu, "Step-over" botoia erabil dezakezu funtzioa saltatu nahi baduzu, eta "Step-out"
//    botoia erabil dezakezu funtzio baten exekuzioa amaitu eta deitzailearen lerroan itzuli nahi baduzu.
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

// Kodearen aplikatutako birfaktorizazioa:
// ---------------------------------------
//
// 1. Javadoc iruzkinak gehitu dira klaseari. [lerro 49-54]
// 2. paint() metodoa gehitu da, mezu bat kolore batez margotzeko eta ANSI kolore eskuz ez idazteko. [lerro 112-114]
// 3. printArray() metodoa gehitu da, ArrayList baten edukia formateatuta inprimatzeko eta kode errepikatua saihesteko. [lerro 122-135]
// 4. main() metodoa birfaktorizatu da, printArray() metodoa erabiliz eta kode askoz garbiagoa lortuz. [lerro 97-103]

/**
 * Softwarearen garapena, eskakizun operazionalak eta programa informatikoak zer diren
 * azaltzen dituen klasea.
 * 
 * @author Kerman Huici
 */
public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    /** ANSI kolore gorria. */
    public static final String RED = "\u001b[31m";

    /** ANSI kolore berdea. */
    public static final String GREEN = "\u001b[32m";

    /** ANSI kolore horia. */
    public static final String YELLOW = "\u001b[33m";

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

        piAzalpenak.add("Programa informatikoak hainbat kategoria ditu, hala nola sistema eragileak "
            + paint(RED, "(Windows, macOS, ...)") + ", aplikazioak "
            + paint(RED, " (Firefox, Steam, ...)") + " eta utilitate programak"
            + paint(RED, " (Microsot Office, CPU-Z, ...)."));

        piAzalpenak.add("Garapen prozesua normalean diseinua, programazioa, probak eta mantentze-lanak barne hartzen ditu.");
        piAzalpenak.add("Programa informatikoaren kalitatea erabiltzailearen esperientzian eta funtzionalitatean oinarritzen da.");
    }

    /**
     * Main metodoa.
     * 
     * @param args Komando lerroko argumentuak.
     */
    public static void main(String[] args) {
        final String EO_TITULUA = "Zer dira eskakizun operazionalak?";
        final String PI_TITULUA = "Zer da programa informatikoa?";

        printArray(PI_TITULUA, piAzalpenak);
        printArray(EO_TITULUA, eoAzalpenak);
    }

    /**
     * Mezu bat kolore batez margotzen du.
     * 
     * @param kolorea ANSI kolorea.
     * @param mezua Margotu nahi den mezua.
     * @return Koloreztatua dagoen mezua.
     */
    public static String paint(String kolorea, String mezua) {
        return kolorea + mezua + "\u001b[0m";
    }

    /**
     * ArrayList baten edukia formateatuta inprimatzen du.
     * 
     * @param titulua ArrayList-aren titulua.
     * @param azalpenak Inprimatu nahi den ArrayList-a.
     */
    public static void printArray(String titulua, ArrayList<String> azalpenak) {
        System.out.println(paint(GREEN, titulua));
        System.out.println("-".repeat(titulua.length()));
        System.out.println();

        for (int i = 0; i < azalpenak.size(); i++) {
            String indexa = paint(YELLOW, String.valueOf(i + 1));
            String lerroa = String.format("%s. %s", indexa, azalpenak.get(i));

            System.out.println(lerroa);
        }

        System.out.println();
    }
}
