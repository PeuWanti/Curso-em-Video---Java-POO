package lutador;

public class Lutador implements fichaLutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador (String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(getPeso() < 52.2 ){
            this.categoria = "Invalido";
        } else if (getPeso() <= 70.3 ) {
            this.categoria = "Leve";
        }  else if (getPeso() <= 83.9 ) {
            this.categoria = "Médio";
        }   else if (getPeso() <= 120.1 ) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }



    @Override
    public void apresentar() {
        System.out.println("APRESENTANDO LUTAAAAAADORRRR");
        System.out.printf("O lutador %s, %s de %d anos mede %.2fm e é da catégoria %s ", getNome(),  getNacionalidade(), getIdade(), getAltura(), getCategoria());
        System.out.printf("Ele tem:\n%d vitorias\n",getVitorias());
        System.out.printf("%d empates\n",getEmpates());
        System.out.printf( "e %d derrotas\n",getDerrotas());
    }

    @Override
    public void status() {
        System.out.printf("O lutador %s é %s e está na categoria peso %s", getNome(), getNacionalidade(), getCategoria());
        System.out.printf("Ele tem %d vitorias, %d empates e %d derrotadas\n",getVitorias(),getEmpates(),getDerrotas() );
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
}
