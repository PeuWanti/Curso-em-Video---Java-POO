public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.viuMaisUm();
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.viuMaisUm();
    }

    public  void avaliar(float porcentagem) {
        int notaConvertida = Math.round(porcentagem / 10);
        this.filme.setAvaliacao(notaConvertida);
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.viuMaisUm();
    }


}
