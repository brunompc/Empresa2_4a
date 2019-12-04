import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    int nif;
    int telefone;

    List<Tarefa> tarefasEncomendadas = new ArrayList<>();
    void mostrarDados() {
        System.out.println(nome);
        System.out.println(nif);
        System.out.println(telefone);
    }

    void mostrarTarefasEncomendadas() {
        for(Tarefa t : tarefasEncomendadas) {
            // String descriaco = t.getDescricao();
            // System.out.println(descricao);
            t.mostrar();
        }
    }
}
