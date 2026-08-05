package CadeiradeRodas;

public class CadeiradeRodas {
    String marca,cor,ligada;
    int velocidade;
    boolean isLigada;

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
        if (this.isLigada){
            ligada = "ligada";
        } else{
            ligada = "desligada";
        }

        System.out.printf("Você possui uma cadeira da %s na cor %s, e nesse momento ela está %s",
                marca,cor,ligada);
    }
}

