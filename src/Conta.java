public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    // Criamos como padrão para não repetirmos código e nem números de contas idênticos
    public Conta(Cliente cliente) {  // Toda conta tem um 'cliente' para ser criado
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;  // Tira valor da conta
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);  // Sacando da conta original
        contaDestino.depositar(valor);  // Depositando na conta destino
    }

    protected void imprimirInformacoesConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));  // '2.f' para casas decimais
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


}
