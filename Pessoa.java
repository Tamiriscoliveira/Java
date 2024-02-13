//classe é uma estrutura que define um tipo de objeto, ele é um molde que define as caracteristicas e comportamentos.
public class Pessoa {
    //atributos(caracteristicas)
    String nome;
    int idade;

    //metodos (comportamentos)
    void  fazAniversario(){
        idade ++;
    }

    void olamundo(){
        System.out.println("Ola Mundo !!!");
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Tamiris";
        pessoa1.idade = 36;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade);

        pessoa1.fazAniversario();
        System.out.println("A idade agora é " + pessoa1.idade);

        pessoa1.olamundo();


    }
}
