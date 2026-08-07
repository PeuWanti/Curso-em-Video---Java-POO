package CadeiradeRodas;

public class CadeiradeRodas {
    private String marca,cor;
    private int velocidade = 1;
    private boolean isLigada = false;

    public CadeiradeRodas(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigada() {
        return isLigada;
    }

    public void setLigada(boolean ligada) {
        isLigada = ligada;
    }

    //metódos de ação
    public void ligar(){
        if (isLigada){
            System.out.println("A cadeira já está ligada");
        }
        System.out.println("Ligando");
        isLigada = true;
    }



    public void desligar(){
        if (!isLigada){
            System.out.println("A cadeira já está desligada");
        }
        System.out.println("Desligando");
        isLigada = false;
    }

    public void acelerar() {
        if (!isLigada) {
            System.out.println("A cadeira precisa estar ligada para essa função");
        } else if (this.velocidade >= 5) {
            System.out.println("A cadeira chegou ao limite de velocidade\n");
        }
        System.out.printf("Acelerando para marcha %d\n",++velocidade);
    }

    public void desacelerar() {
        if (!isLigada) {
            System.out.println("A cadeira precisa estar ligada para essa função");
        } else if (this.velocidade == 1) {
            System.out.println("A cadeira está na menor marcha");
        }else {
            System.out.printf("Desacelerando para marcha %d\n",--velocidade);
        }
    }

    public void status() {
        String statusLigada = isLigada? "Ligada":"Desligada";

        System.out.printf("Você possui uma cadeira da %s na cor %s, e nesse momento ela está %s\n",
                this.getMarca(),this.getCor(),statusLigada);
    }
}

