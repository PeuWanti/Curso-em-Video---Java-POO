public class Main {
    static void main(String[] args) {
        Conta conta1 = new Conta("Peu", "CC", 500);
        conta1.statusConta();
        conta1.depositar(500);
        conta1.sacar(500);
    }

}

