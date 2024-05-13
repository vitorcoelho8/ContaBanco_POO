public class Santander extends Client{
    private static int SEQUENCIAL = 1;
    public Santander(){
        super.agencia = Client.agenciaPadraoSan;
        super.numero = SEQUENCIAL++;
        super.saldo = 2000.0;
    }

    public void imprimirExtrato(){
        System.out.println("==== EXTRATO SANTANDER ====");
        super.infosComuns();
    }

}
