import java.util.Scanner;
import java.util.ArrayList;

public class EstekakEtaScrumAzalpena {
    public static final Scanner sc = new Scanner(System.in);

    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String RESET = "\u001b[0m";

    public static final ArrayList<String> azalpenak = new ArrayList<>();

    static {
        azalpenak.add("\"Scrum\" proiektu kudeaketa metodologia bat da, batez ere software garapenean erabiltzen dena.");
        azalpenak.add("Agile printzipioetan oinarritzen da eta taldeek lan egiteko modu eraginkorra eskaintzen du.");
        azalpenak.add("Scrum-en, lanak 'sprints' izeneko epe laburretan banatzen dira, eta taldeek helburu zehatzak lortzen dituzte epe horietan.");
        azalpenak.add("Scrum-ek rol zehatzak definitzen ditu, hala nola Product Owner, Scrum Master eta Development Team.");
        azalpenak.add("Eguneroko bilera laburrak (\"Daily Stand-ups\") egiten dira, non taldeak aurrerapenak eta oztopoak partekatzen dituen.");
        azalpenak.add("Scrum prozesuak jarraipen eta hobekuntza etengabea sustatzen du, bezeroaren beharrak modu eraginkorrean asetzeko.");
    }

    public static void main(String[] args) {
        final String TITULUA = "Zer da Scrum metodologiak?";

        System.out.println(TITULUA);
        System.out.println("-".repeat(TITULUA.length()));
        System.out.println();

        for (String azalpena : azalpenak) {
            System.out.println(azalpena);
        }
    }
}
