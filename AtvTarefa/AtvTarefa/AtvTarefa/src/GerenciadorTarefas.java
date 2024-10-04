public class GerenciadorTarefas {
    private Tarefa[] tarefas;
    private int count;

    public GerenciadorTarefas() {
        this.tarefas = new Tarefa[50]; 
        this.count = 0;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (count < tarefas.length) {
            tarefas[count++] = tarefa;
        } else {
            System.out.println("Limite de tarefas alcançado! Não é possível adicionar mais.");
        }
    }

    public void removerTarefa(int posicao) {
        if (posicao < 0 || posicao >= count) {
            System.out.println("Posição inválida.");
            return;
        }
   
        for (int i = posicao; i < count - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }
        tarefas[--count] = null; 
    }

    public void marcarConcluida(int posicao) {
        if (posicao < 0 || posicao >= count) {
            System.out.println("Posição inválida.");
            return;
        }
        tarefas[posicao].marcarConcluida();
    }

    public void listarTarefas() {
        if (count == 0) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }

        System.out.println("Tarefas Pendentes:");
        for (int i = 0; i < count; i++) {
            if (tarefas[i].getStatus().equals("pendente")) {
                System.out.println(tarefas[i]);
            }
        }

        System.out.println("\nTarefas Concluídas:");
        for (int i = 0; i < count; i++) {
            if (tarefas[i].getStatus().equals("concluída")) {
                System.out.println(tarefas[i]);
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade) {
        if (count == 0) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }

        System.out.println("Tarefas com prioridade " + prioridade + ":");
        for (int i = 0; i < count; i++) {
            if (tarefas[i].getPrioridade().equalsIgnoreCase(prioridade)) {
                System.out.println(tarefas[i]);
            }
        }
    }
}
