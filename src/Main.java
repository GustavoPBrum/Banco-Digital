//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");  // Setando um nome

        Conta cc = new ContaCorrente(gustavo);

        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(gustavo);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}