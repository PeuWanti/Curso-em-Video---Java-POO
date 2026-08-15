public class Paciente {
    private String nome;
    private int idade;
    private String telefone;
    private String problema;

    public Paciente(String nome, int idade, String telefone, String problema) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.problema = problema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void fichaPaciente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Problema: " + getProblema());
    }
}
