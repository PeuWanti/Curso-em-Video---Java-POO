public class ControleRemoto implements Controlador{

    private boolean ligado;
    private boolean desligado;
    private boolean tocando;
    private int volume;

    public ControleRemoto(){
        ligado = false;
        desligado = false;
        tocando = false;
        volume = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando(){
        return tocando;
    }

    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }


    public void ligar() {
        this.setLigado(true);
        this.setDesligado(false);
    }

    public void desligar() {
        this.setDesligado(true);
        this.setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("\nAbrindo Menu...\n");
        System.out.println("Ligado: "+this.isLigado());
        System.out.println("Desligado: "+this.isDesligado());
        System.out.println("Tocando: "+this.isTocando());
        System.out.print("Volume: "+this.getVolume());
        for (int i = 1; i<= this.getVolume(); i+=10 ) {
            System.out.print("|");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu...\n");
    }

    public void aumentarVolume(int volume) {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + volume);
        } else {
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }

    public void diminuirVolume(int volume) {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - volume);
        }  else {
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() >= 0) {
            this.setVolume(0);
        } else if (this.getVolume() <= 0) {
            setVolume(50);
        } else{
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }

    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else if (this.getVolume() != 0) {
            setVolume(0);
        } else{
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }


    public void play() {
        if (this.isLigado() && !isTocando()) {
            this.setTocando(true);
        } else if (isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }

    public void pause() {
        if (this.isLigado() && isTocando()) {
            this.setTocando(false);
        } else if (!isTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("A TV precisa estar ligada para completar essa tarefa");
        }
    }
}
