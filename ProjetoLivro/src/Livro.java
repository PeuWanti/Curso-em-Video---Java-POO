public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int qtdPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int qtdPaginas, int pagAtual,Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        System.out.println("Abriu Livro");
        setAberto(true);
    }

    @Override
    public void fechar() {
        System.out.println("Fechou Livro");
        setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        System.out.println("Folheando páginas do livro até a pagina " + pagina);
        setPagAtual(pagina);
    }

    @Override
    public void avancarPag(int paginas) {
        if(getPagAtual() + paginas >= getQtdPaginas()){
            System.out.println("Chegou ao final do livro");
            setPagAtual(getQtdPaginas());
            return;
        }

        System.out.printf("Avançando %d página(s)\n",paginas);
        setPagAtual(getPagAtual() + paginas);
    }

    @Override
    public void voltarPag(int paginas) {

        if(getPagAtual() - paginas <= 0){
            System.out.println("Chegou ao inicio do livro");
            setPagAtual(0);
            return;
        }

        System.out.printf("Voltando %d página(s)\n", paginas);
        setPagAtual(getPagAtual() - paginas);
    }

    public void descricao() {
        System.out.printf("Descricao do Livro %s:\n",getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Qtd Paginas: "+getQtdPaginas());
        System.out.println("PagAtual: "+getPagAtual());
        System.out.println("Aberto: "+isAberto());
        System.out.println("Sendo lido por: "+leitor.getNome());
        System.out.println("Sexo do Livro: "+leitor.getSexo());
        System.out.println("idade do leitor: "+leitor.getIdade());
    }

}
