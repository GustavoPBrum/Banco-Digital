public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Ele não obriga 'Conta' a criar o 'ImprimirExtrato' mas obriga as classes filhas
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInformacoesConta();
    }

}
