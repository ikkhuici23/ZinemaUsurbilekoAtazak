import java.util.ArrayList;

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
