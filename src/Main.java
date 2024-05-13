public class Main {
    public static void main(String[] args) {
        Conta cc = new Conta();
        Santander san = new Santander();
        Itau itau = new Itau();
        san.imprimirExtrato();
        itau.imprimirExtrato();

    }
}
