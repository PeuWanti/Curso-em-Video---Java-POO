package Caneta;

public class Caneta {
    public String modelo, cor;
    int carga;
    float ponta;
    boolean isTampada;
    String tampada;

    public void rabiscar(){
        if (this.isTampada) {
            System.out.println("Esta tampada");
        } else {
            System.out.println("\nRabiscando");
        }
    }

    public void tampar(){
        this.isTampada = true;
        System.out.println("\nTampando");
    }

    public void destampar(){
        this.isTampada = false;
        System.out.println("\n Destampando");
    }

    public void status(){
        if (this.isTampada) {
            tampada = "tampada";
        }  else {
            tampada = "destampada";
        }
        System.out.printf("Você criou uma caneta %s na cor %s com a ponta %.1f." +
                " Nesse momento ela está %s", this.modelo, this.cor, this.ponta, this.tampada);
    }
}
