import java.util.Scanner;
import java.util.ArrayList;

public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    public static final Scanner sc = new Scanner(System.in);

    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String RESET = "\u001b[0m";

    public static final ArrayList<String> eoAzalpenak = new ArrayList<>();
    public static final ArrayList<String> piAzalpenak = new ArrayList<>();

    static {
        eoAzalpenak.add("Eskakizun operazionalak sistema edo software baten funtzionamendu beharrak eta baldintzak zehazten dituzten dokumentuak dira.");
        eoAzalpenak.add("Helburua sistema edo softwareak bezeroaren beharrak modu eraginkorrean asetzea da.");
        eoAzalpenak.add("Eskakizun operazionalek funtzionalitate zehatzak, errendimendu baldintzak, segurtasun neurriak eta erabilgarritasun eskakizunak barne hartzen dituzte.");
    }

    static {
        piAzalpenak.add("Programa informatikoa software aplikazio edo sistemak dira, ordenagailuetan exekutatzeko diseinatuta daudenak.");
        piAzalpenak.add("Programa informatikoak hainbat helburu izan ditzakete, hala nola datuak prozesatzea, komunikazioa erraztea edo entretenimendua eskaintzea.");
        piAzalpenak.add("Programa informatikoak hainbat kategoria ditu, hala nola sistema eragileak" + RED + " (Windows, macOS, ...)" + RESET + ", aplikazioak" + RED + " (Firefox, Steam, ...)" + RESET + " eta utilitate programak" + RED + " (Microsot Office, CPU-Z, ...)." + RESET);
        piAzalpenak.add("Garapen prozesua normalean diseinua, programazioa, probak eta mantentze-lanak barne hartzen ditu.");
        piAzalpenak.add("Programa informatikoaren kalitatea erabiltzailearen esperientzian eta funtzionalitatean oinarritzen da.");
    }

    public static void main(String[] args) {
        final String EO_TITULUA = "Zer dira eskakizun operazionalak?";

        System.out.println(GREEN + EO_TITULUA + RESET);
        System.out.println("-".repeat(EO_TITULUA.length()));
        System.out.println();

        for (int i = 0; i < eoAzalpenak.size(); i++) {
            System.out.println(YELLOW + (i + 1) + RESET + ". " + eoAzalpenak.get(i));
        }

        System.out.println();

        final String PI_TITULUA = "Zer da programa informatikoa?";

        System.out.println(GREEN + PI_TITULUA + RESET);
        System.out.println("-".repeat(PI_TITULUA.length()));
        System.out.println();

        for (int i = 0; i < piAzalpenak.size(); i++) {
            System.out.println(YELLOW + (i + 1) + RESET + ". " + piAzalpenak.get(i));
        }
    }
}
