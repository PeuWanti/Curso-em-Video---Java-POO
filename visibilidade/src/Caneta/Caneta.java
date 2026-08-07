package Caneta;

public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
    private float ponta;
    private boolean isTampada = true;

    //Constructor
    public Caneta(String modelo,String cor,float ponta){
        setModelo(modelo);
        setCor(cor);
        setPonta(ponta);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return isTampada;
    }

    public void setTampada(boolean isTampada) {
        this.isTampada = isTampada;
    }


    // Métodos de Ação
    public void rabiscar() {
        if (isTampada()) {
            System.out.println("Erro: A caneta está tampada!");
        } else {
            System.out.println("\nRabiscando...");
        }
    }

    public void tampar() {
        setTampada(true);
        System.out.println("\nTampando...");
    }

    public void destampar() {
        setTampada(false);
        System.out.println("\nDestampando...");
    }

    public void status() {
        String estadoTampa = isTampada() ? "tampada" : "destampada";

        System.out.printf("Você criou uma caneta %s na cor %s com a ponta %.1f. Nesse momento ela está %s.%n",
                this.getModelo(), this.getCor(), this.getPonta(), estadoTampa);
    }
}