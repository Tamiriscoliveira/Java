public class Livro {
    private String titulo;
    private String autor;

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }

    public  void exibirDetalhes(){
        System.out.println("O  livro é: " + getTitulo());
        System.out.println("Do autor: " + getAutor());
    }

    public static void main(String[] args) {
        Livro meuLivroFavorito = new Livro();
        meuLivroFavorito.setTitulo("A Menina feita de Espinhos");
        meuLivroFavorito.setAutor("Fabiane Ribeiro");

        Livro meuLivroFavorito2 = new Livro();
        meuLivroFavorito2.setTitulo("Nascido para Correr");
        meuLivroFavorito2.setAutor("Christopher McDougall");

        meuLivroFavorito.exibirDetalhes();
        meuLivroFavorito2.exibirDetalhes();
    }
}
