package CadeiradeRodas;

public class Main {
    public static void main(String[] args) {
        CadeiradeRodas cadeira = new CadeiradeRodas();
        cadeira.marca = "Ortobom";
        cadeira.cor = "Azul";
        cadeira.isLigada = true;
        cadeira.velocidade = 1;

        cadeira.acelerar();
        cadeira.acelerar();
        cadeira.desacelerar();
        cadeira.desacelerar();
        cadeira.desacelerar();
        cadeira.status();

    }
}
