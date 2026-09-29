package guardado;

public class Main {
    static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(); // instancia é criar objeto a partir da classe Pessoa.

        pessoa1.nome = "Wendell";
        pessoa1.idade = 22;

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        //->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Carro meucarro = new Carro();
        meucarro.setModelo("Honda");
        meucarro.setAno(1990);
        meucarro.setCor("Black");

        System.out.println(meucarro.getModelo());
        System.out.println(meucarro.getAno());
        System.out.println(meucarro.getCor());

        //---------------------------------------->
        Carro novoCarro = new Carro("Fiat t", 2020, "White");
        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());
    }
}