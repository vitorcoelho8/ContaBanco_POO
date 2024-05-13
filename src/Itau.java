public class Itau extends Client{

    private static int SEQUENCIAL = 1;
    public Itau(){
        super.agencia = Client.agenciaPadraoItau;
        super.numero = SEQUENCIAL++;
        super.saldo = 1000.0;
    }

    public void imprimirExtrato(){
        System.out.println("==== EXTRATO ITAU ====");
        super.infosComuns();
    }
}
