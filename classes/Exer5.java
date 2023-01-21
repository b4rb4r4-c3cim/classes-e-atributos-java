public class Exer5 {
    public static void main(String[] args){

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.titulo = "Cem anos de solidao";
        livro.autor = "Gabriel Garcia";
        livro.numPaginas = 450;
        livro.editora = "Record";
        livro.anoLancamento = 2000;

        livro.emprestado = true;
        livro.devolvido = false;
        livro.codigoIdentificacao = 45656565;
        livro.genero = "Romance";


        System.out.println("Titulo do livro: " + livro.titulo);
        System.out.println("Autor do livro: " + livro.autor);
        System.out.println("Numero de paginas: " + livro.numPaginas);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Ano de lancamento: " + livro.anoLancamento);
        System.out.println("Livro emprestado? " + livro.emprestado);
        System.out.println("Livro devolvido? " + livro.devolvido);
        System.out.println("Codigo de identificacao: " + livro.codigoIdentificacao);
        System.out.println("Genero: " + livro.genero);
    }
}
