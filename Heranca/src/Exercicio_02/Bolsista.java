package Exercicio_02;

public class Bolsista extends Aluno{

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Por ser bolsista, o aluno " + this.getNome() + " não tem custos com mensalidade");
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome());
    }
}
