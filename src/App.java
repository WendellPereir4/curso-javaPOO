import Utils.DataUtil;
import model.ContaBancária;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Movimentacao;

public class App {
    static void main(String[] args) {
        System.out.println("Criando banco");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0) {
        };

        System.out.println("Saldo atual de R$: " + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$: " + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(350.0);
        System.out.println("Saldo atual de R$: " + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "7543", 6, 200.0);
        conta2.transferir(100.0, conta);
        System.out.println("Saldo atual conta destino de R$: " + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$: " + conta.getSaldo());
        System.out.println();

        System.out.println(conta2.getDataAbertura());

        var formatado = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
        System.out.println(formatado);

        Movimentacao movimentacao = new Movimentacao("Saque", 100.0);
        System.out.println(movimentacao);

        movimentacao.toString();

        //Extrato bancario é composto por movimentações bancárias.
        //Ter algo que possa ser a movimentação.
        //Ter uma lista de movimentaçções.
    }
}
