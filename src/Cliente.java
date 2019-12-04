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

    void mostrarFacturacao(String mes) {
        long precoTotal = 0;
        for(Tarefa t : tarefasEncomendadas) {
            String descricao = t.getDescricao();
            int precoTarefa = t.calcularPreco();
            System.out.println(descricao + " ->" + precoTarefa);
            precoTotal = precoTotal + precoTarefa;
        }
        System.out.println("Total a pagar:" + precoTotal);
    }
}
