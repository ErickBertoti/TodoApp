import java.util.ArrayList;

public class Armazenamento {
    private ArrayList<Tarefa> tarefas;
    private static int incremento;

    public Armazenamento() {
        this.tarefas = new ArrayList<>();
        this.incremento = 1;
    }

    public void inserir(Tarefa tarefa){
        tarefa.setId(this.incremento++);
        this.tarefas.add(tarefa);
    }

    public void atualizar(Tarefa tarefa){
        int index = this.tarefas.indexOf(tarefa);
        if (index >= 0) {
            this.tarefas.set(index, tarefa);
        }
    }

    public void remover(Tarefa tarefa){

    }

    public ArrayList<Tarefa> listar(){
        return this.tarefas;
    }
}
