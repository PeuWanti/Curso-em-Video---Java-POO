package Exercicio_02;

public class Tecnico extends Aluno {

    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
        super(nome,idade,sexo,matricula,curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("O técnico " + this.getNome() +" está praticando as aulas de " + this.getCurso());
    }

}
