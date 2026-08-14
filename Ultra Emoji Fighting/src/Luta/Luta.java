package Luta;

import lutador.Lutador;

import java.util.Random;

public class Luta implements cadastrarLuta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }


    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (!l1.getCategoria().equals(l2.getCategoria()) || l1.getNome().equals(l2.getNome())){
            System.out.println("Erro ao cadastrar Luta!");
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            return;
        }
        System.out.println("Luta cadastrada com sucesso!");
        this.aprovado = true;
        this.desafiado = l1;
        this.desafiante = l2;
    }

    @Override
    public void lutar() {
        if (!this.aprovado) {
            System.out.println("Essa luta não foi aprovada.");
            return;
        }
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();

        Random aleatorio = new Random();
         int resultado =  aleatorio.nextInt(3);

         switch (resultado) {
             case 0:
                 System.out.println("\nA LUTA ACABABOU EM EMPATE");
                 this.desafiado.setEmpates(this.desafiado.getEmpates() + 1);
                 this.desafiante.setEmpates(this.desafiante.getEmpates() + 1);
                 break;

             case 1:
                 System.out.printf("\n%S VENCEU ",this.desafiado.getNome());
                 this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                 this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1);
                 break;

             case 2:
                 System.out.printf("\n%S VENCEU ",this.desafiante.getNome());
                 this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                 this.desafiado.setDerrotas(this.desafiante.getDerrotas() + 1);
         }
    }
}

