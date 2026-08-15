public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 20, 'M');
        Livro l1 = new Livro("Grande Rei","Plínio",352,89,p1);
        l1.descricao();
        l1.avancarPag(40);
        l1.descricao();

    }
}
