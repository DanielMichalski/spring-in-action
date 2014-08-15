package poem;

/**
 * Author: Daniel
 */
public class Sonnet29 implements Poem {
    private static String[] LINES = {
            "Dobra jednego, innego zdolnoci, ",
            "Gdy tym co moje zgoa si nie ciesz. ",
            "Lecz gdy od myli tych brzydnie mi ycie, ",
            "Wraca o tobie myl, a moja dusza ",
            "Niby skowronek zrywa si o wicie ",
            "I hymn podnosz	c bramy niebios wzrusza; ",
            "Gdy twej mioci najsodsze wspomnienie ",
            "Sprawia, e z królem losu nie zamieni."
    };

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
