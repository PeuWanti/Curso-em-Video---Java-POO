package Exercicio_01;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro",20,'M',20020,"Java POO");
        Funcionario funcionario1 = new Funcionario("Katia",55,'F',"Designer");
        Professor professor1 = new Professor("Guanabara","POO",15000,42,'M');

        System.out.println(aluno1);
        System.out.println(funcionario1);
        System.out.println(professor1);
    }
}
