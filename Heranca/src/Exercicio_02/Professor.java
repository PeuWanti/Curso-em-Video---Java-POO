package Exercicio_02;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome,idade,sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public void receberAumento(float salario) {
        this.setSalario(getSalario() + salario);
    }
}

