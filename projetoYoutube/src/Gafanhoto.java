public class Gafanhoto extends Pessoa {

    private String logim;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String logim) {
        super(nome, idade, sexo);
        this.logim = logim;
        this.totAssistido = 0;
    }

    public String getLogim() {
        return logim;
    }

    public void setLogim(String logim) {
        this.logim = logim;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "logim='" + logim + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }

    public void viuMaisUm() {
        this.totAssistido++;
    }
}
