import java.util.ArrayList;
import java.util.List;

public class Empresa {

    String nome;

    List<Tarefa> tarefas = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();

    void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    void relatorioListaClientes() {
        System.out.println("Lista de Clientes:");
        for(Cliente c : clientes) {
            c.mostrarDados();
            System.out.println("---");
        }
    }

    void relatorioListaClientesETarefas() {
        for(Cliente c : clientes) {
            c.mostrarTarefasEncomendadas();
        }
    }

    void mostrarRelatorioFacturacao(String mes) {
        for(Cliente c : clientes) {
            c.mostrarFacturacao(mes);
        }
    }

}
