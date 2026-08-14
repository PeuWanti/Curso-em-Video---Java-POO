import Luta.Luta;
import lutador.Lutador;

public class Main {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Anderson Silva", "Brasileira", 29, 1.77F, 88.0F, 54, 21, 8);
        lutadores[1] = new Lutador("Pretty Boy", "França", 31, 1.75F, 68.9F, 11, 2, 1);
        lutadores[2] = new Lutador("Crazy Dog", "Brasil", 26, 1.65F, 57.8F, 14, 2, 3);
        lutadores[3] = new Lutador("Snapshadow", "EUA", 35, 1.65F, 80.9F, 12, 2, 1);
        lutadores[4] = new Lutador("Dead Code", "Austrália", 28, 1.93F, 81.6F, 13, 0, 2);
        lutadores[5] = new Lutador("UFOCobol", "Brasil", 37, 1.70F, 119.3F, 5, 4, 3);

        Luta luta = new Luta();
        luta.marcarLuta(lutadores[3], lutadores[4]);
        luta.lutar();
    }
}