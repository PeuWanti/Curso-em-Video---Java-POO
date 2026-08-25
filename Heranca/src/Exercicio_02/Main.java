package Exercicio_02;

public class Main {
    public static void main(String[] args) {

        // 1. Visitante (Herança simples)
        Visitante v1 = new Visitante("Lucas", 20, "M");
        System.out.println(v1.toString());
        v1.fazerAniversario();
        System.out.println("Idade pós-aniversário: " + v1.getIdade());
        System.out.println();

        // 2. Bolsista (Herda de Aluno + Sobrescreve pagarMensalidade)
        Bolsista b1 = new Bolsista("Júlio", 22, "M", 2222, "Informática", 12.5f);
        System.out.println(b1.toString());
        b1.pagarMensalidade(); // Exibe a mensagem exclusiva de bolsista
        b1.renovarBolsa();
        System.out.println();

        // 3. Técnico (Herda de Aluno + Método próprio)
        Tecnico t1 = new Tecnico("Rodrigo", 25, "M", 3333, "Redes", "REG-9876");
        t1.pagarMensalidade(); // Exibe a mensagem padrão de aluno (herdada)
        t1.praticar();
        System.out.println();

        // 4. Professor (Herda diretamente de Pessoa)
        Professor p1 = new Professor("Guanabara", 40, "M", "Programação", 2500.00f);
        p1.receberAumento(500.00f);
        System.out.println(p1.toString());
    }
}

