public class Aluno {
    String nome;
    int idade;
    private double nota1;
    private double nota2;
    private double nota3;

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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    void exibeinformacoes(){
        System.out.println("O nome do Aluno(a) é: " + nome);
        System.out.println("Ele(a) tem:  " + idade + " anos");
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Tamiris";
        aluno.idade = 36;

        aluno.exibeinformacoes();
        System.out.println("##################################");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        aluno1.setNota1(7.5);
        aluno1.setNota2(8.0);
        aluno1.setNota3(9.2);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Elis");
        aluno2.setNota1(6.8);
        aluno2.setNota2(7.3);
        aluno2.setNota3(8.5);

        System.out.println("Aluno 1");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("##################################");

        System.out.println("Aluno 2");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("##################################");
    }
}
