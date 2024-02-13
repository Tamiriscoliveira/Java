public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numeroAvaliacoes;
    double somaDasAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Album: "  + titulo +  "\nArtista: " + artista);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numeroAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numeroAvaliacoes;
    }

    public static void main(String[] args) {
        Musica minhamusica = new Musica();

        minhamusica.titulo = "Samba da Maria";
        minhamusica.artista = "Maria Rita";
        minhamusica.anoDeLancamento = 2022;

        minhamusica.exibirFichaTecnica();
        minhamusica.avalia(5);
        minhamusica.avalia(10);

        double mediaAvaliacoes =minhamusica.pegaMedia();
        System.out.println("média das avaliacoes " + mediaAvaliacoes);
    }
}
