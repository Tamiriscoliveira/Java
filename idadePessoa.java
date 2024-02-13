public class idadePessoa {
    private String nome;
    private int idade;

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade(){
        if (idade >= 18){
            System.out.println(nome + " é maior de idade ");
        }else{
            System.out.println(nome + " menor de idade");
        }
    }

    public static void main(String[] args) {
        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setNome("Maria");
        pessoa1.setIdade(22);

        idadePessoa pessoa2 = new idadePessoa();
        pessoa2.setNome("José");
        pessoa2.setIdade(17);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        pessoa1.verificaIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        pessoa2.verificaIdade();
    }
}
