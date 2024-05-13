public class Conta extends Client{
    protected double saldo;
    public void sacar (double valor){
        saldo -= valor;
    }
    public void depositar (double valor) {
        saldo += valor;
    }
    public void transferir (double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
