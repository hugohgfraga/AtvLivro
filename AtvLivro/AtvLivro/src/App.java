public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarLivro(new Livro("Harry Potter", "J. K. Rowling", "97885730236", 10));
        estoque.adicionarLivro(new Livro("1984", "George Orwell", "9788573021452", 5));

        System.out.println("Livros no estoque:");
        estoque.listarLivros();

        estoque.atualizarQuantidade("9788573023630", 15);
        System.out.println("\nApós atualizar a quantidade do livro:");
        estoque.listarLivros();

        estoque.removerLivro("9788573021452");
        System.out.println("\nApós remover um livro:");
        estoque.listarLivros();

        Livro livro = estoque.buscarLivro("9788573023630");
        if (livro != null) {
            System.out.println("\nLivro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
