public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.abrirMenu();
        controle.aumentarVolume(10);
        controle.abrirMenu();
    }
}
