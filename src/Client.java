public abstract class Client {
    protected static final int agenciaPadraoItau = 1066;
    protected static final int agenciaPadraoSan = 5073;
    protected int agencia;
    protected double saldo;
    protected int numero;
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimirExtrato(){
        infosComuns();
    }

    protected void infosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));

    }
}
