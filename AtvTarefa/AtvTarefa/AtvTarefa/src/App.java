public class App {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

       
        gerenciador.adicionarTarefa(new Tarefa("Fazer compras", "alta"));
        gerenciador.adicionarTarefa(new Tarefa("Estudar para a prova", "média"));
        gerenciador.adicionarTarefa(new Tarefa("Limpar a casa", "baixa"));

        System.out.println("Lista de Tarefas:");
        gerenciador.listarTarefas();

        gerenciador.marcarConcluida(1);
        System.out.println("\nApós marcar uma tarefa como concluída:");
        gerenciador.listarTarefas();

        gerenciador.removerTarefa(0);
        System.out.println("\nApós remover uma tarefa:");
        gerenciador.listarTarefas();

        gerenciador.listarTarefasPrioridade("baixa");
    }
}