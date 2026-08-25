package Exercicio_01;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando(boolean b) {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        if(getSetor().equals("Desempregado")){
            trabalhando = false;
        }
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Exercicio_01.Funcionario{\n" +
                " nome=" + nome +
                ", idade=" + idade +
                ", sexo=" + sexo +
                " setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                "\n}";
    }

    public void mudarTrabalho(String novoSetor){
        if (novoSetor.equals(getSetor())){
            setSetor(novoSetor);
        }
    }
}
