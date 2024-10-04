import java.util.Arrays;

public class Estoque {
    private Livro[] livros;
    private int count;

    public Estoque() {
        this.livros = new Livro[100];
        this.count = 0;
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < count; i++) {
        if (livros[i].getIsbn().equals(livro.getIsbn())) {
                livros[i].setQuantidade(livros[i].getQuantidade() + livro.getQuantidade());
                return;
            }
        }
        
        if (count < livros.length) {
            livros[count++] = livro;
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais livros.");
        }
    }

    public void removerLivro(String isbn) {
        for (int i = 0; i < count; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                for (int j = i; j < count - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[--count] = null; 
                return;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
    }

    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < count; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        return null; 
    }

    public void listarLivros() {
        if (count == 0) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(livros[i]);
        }
    }

    public void atualizarQuantidade(String isbn, int quantidade) {
        Livro livro = buscarLivro(isbn);
        if (livro != null) {
            livro.setQuantidade(quantidade);
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }
}