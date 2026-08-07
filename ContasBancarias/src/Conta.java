public class Conta {
    private String titular, tipoConta;
    private double saldo, mensalidade;

    public Conta(String titular, String tipoConta) {
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.setMensalidade();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade() {
        if (getTipoConta().equals("CC")) {
            this.mensalidade = 15;
        } else if (getTipoConta().equals("CP")) {
            this.mensalidade = 20;
        }
    }

    public void statusConta() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Tipo Conta: " + getTipoConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Mensalidade: " + getMensalidade());
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.printf("Deposito: %.2f%n seu saldo agora é de %.2f%n ", valor, getSaldo());
    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.printf("Deposito: %.2f%n seu saldo agora é de %.2f%n", valor, getSaldo());
        }
    }
}



