public class ContaBancaria {
    private int numeroDaconta;
    private double saldo;
    public String titular;

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroDaconta(123);
        conta.setSaldo(1000);
        conta.titular = "Tamiris";

        System.out.println("Número da Conta: " + conta.getNumeroDaconta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(2500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
