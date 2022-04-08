package secao8.JavaPOO.ExercicioFixacao4;

public class Conta {
    private final int numeroConta;
    private String nomeTitularConta;
    private double depositoInicial;
    private double saldoConta;

    public Conta(int numeroConta, String nomeTitularConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        this.depositoInicial = depositoInicial;
        saldoConta = depositoInicial;
    }

    public Conta(int numeroConta, String nomeTitularConta) {
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void realizarSaque(double saque){
        saldoConta -= saque + 5;
    }

    public void realizarDeposito(double deposito){
        saldoConta += deposito;
    }

    @Override
    public String toString() {
        return 
            "Nome do Titular da Conta: " + nomeTitularConta +"\n"+
            "Número da Conta: " + numeroConta +"\n"+
            "Depósito Inicial na Conta: " + 
            String.format("R$ %.2f",depositoInicial) +"\n"+
            "Saldo na Conta: " + 
            String.format("R$ %.2f",saldoConta)+"\n";
    }

    
    
    

}
