package Exercicio_01;

public class Aluno extends Pessoa{
    private Integer matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome,idade,sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Exercicio_01.Aluno{\n" +
                "nome=" + nome +
                ", idade=" + idade +
                ", sexo=" + sexo +
                " matricula=" + matricula +
                ", curso='" + curso + '\'' +
                "\n}";
    }

    public void mudarCurso(String novoCurso){
        if (novoCurso == null){
            System.out.print("Você deve informar um novo curso");
            return;
        }
        else if(getCurso().equals(novoCurso)){
            System.out.print("O aluno já está matriculado nesse curso");
            return;
        }
        this.setCurso(novoCurso);
        System.out.print("Curso alterado com sucesso!\n novo curso: " + this.getCurso());
    }

    public void cancelarMatricula(){
        if (getMatricula() == null){
            System.out.print("Sua matrícula já foi excluida anteriormente");
            return;
        }
        setMatricula(null);
    }

}
