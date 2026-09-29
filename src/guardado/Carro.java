package guardado;

public class Carro {

    //atributos
    public String Modelo;
    public Integer Ano;
    public String cor;

    //Construtor
    public Carro(){}
    public Carro(String modelo, Integer ano, String cor){
        this.Modelo = modelo;
        this.Ano = ano;
        this.cor = cor;
    }

    //Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        Ano = ano;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
