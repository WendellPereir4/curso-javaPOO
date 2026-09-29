package model;

public class ContaCorrente extends ContaBancária { //herdando da classe ContaBancária
    public ContaCorrente(String agencia, String numeroDaconta, Integer digito, Double saldoInicial) {

        // aqui cria conta bancária.
        super(agencia, numeroDaconta, digito, saldoInicial);
    }
}
