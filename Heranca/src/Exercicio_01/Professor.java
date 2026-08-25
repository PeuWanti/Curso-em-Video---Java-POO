package Exercicio_01;

public class Professor extends Pessoa {
    private String materia;
    private double salario;

    public Professor(String nome, String materia, double salario, int idade, char sexo) {
        super(nome, idade, sexo);
        this.materia = materia;
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Exercicio_01.Professor{\n" +
                "nome=" + nome +
                ", idade=" + idade +
                ", sexo=" + sexo +
                " materia='" + materia + '\'' +
                ", salario=" + salario +
                "\n}";
    }

    public void receberAumento(double aumento){
        setSalario(getSalario() + aumento);
        System.out.println("Salário do professor aumentado para: " + getSalario());
    }
}
