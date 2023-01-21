public class Exer4 {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.titulo = "Cem anos de solidao";
        livro.autor = "Gabriel Garcia";
        livro.numPaginas = 450;
        livro.editora = "Record";
        livro.anoLancamento = 2000;

        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Autor do livro: " + livro.autor);
        System.out.println("Numero de paginas: " + livro.numPaginas);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);
    }
}
