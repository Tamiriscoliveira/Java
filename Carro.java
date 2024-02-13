public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo +  " Cor: " + cor + " Ano: " + ano);
    }

    int calculaIdade(){
        return 2024 - ano;
    }

    public static void main(String[] args) {
        Carro meucarro = new Carro();

        meucarro.modelo = "Gol";
        meucarro.ano = 2008;
        meucarro.cor = "Preto";

        meucarro.exibeFichaTecnica();

        System.out.println("a idade do carro é " + meucarro.calculaIdade() + " anos");
    }
}
