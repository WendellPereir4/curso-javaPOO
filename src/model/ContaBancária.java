package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancária { // vai ser uma classe abstrata, vai ser apenas um modelo.
    //region Atributos
    private String agencia;
    private String numeroDaconta;
    private Integer digito;
    private Double saldo;
    private Date dataAbertura;
    private ArrayList<Movimentacao> movimentacoes;
    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //endregion

    //region Construtor
    public ContaBancária(String agencia, String numeroDaconta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.numeroDaconta = numeroDaconta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date(); // quando for criado a conta bancária, ele vai pegar data e hora atual da máquina.

        // se não instanciar, pode dar erro! vvv
        this.movimentacoes = new ArrayList<Movimentacao>();
        Movimentacao movimentacao = new Movimentacao("abertura de conta", saldo);

        this.movimentacoes.add(movimentacao);
    }
    //endregion

    //region getters e setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(String numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }
    //endregion

    //region Metodos
    // verifica se o deposito é minimo 10 reais.
    public void depositar(Double valor){

        if (valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("Valor minimo de deposito é R$: " + VALOR_MINIMO_DEPOSITO);
        }

        this.saldo += valor;
    }

    //verifica se o saldo para sacar é maior do que vc tem!
    public Double sacar(Double valor){

        if (valor > this.saldo){
            throw new InputMismatchException("Saldo insuficiente");
        }

        this.saldo -= valor;
        return valor;
    }

    public void transferir(Double valor, ContaBancária contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);

    }
    //endregion
}
