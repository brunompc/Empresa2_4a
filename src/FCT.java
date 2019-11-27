import java.util.ArrayList;
import java.util.List;

public abstract class FCT extends Funcionario {

    List<Tarefa> tarefas = new ArrayList<>();

    FCT(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    FCT(String nome, int id) {
        super(nome, id);
    }

    void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    int contarTarefas (String mes) {
        int nrTarefasGeridas = 0;
        for(Tarefa t : tarefas) {
            String mesTarefa = t.getMes();
            if(mesTarefa.equals(mes)) {
                nrTarefasGeridas++;
            }
        }
        return nrTarefasGeridas;
    }


}
