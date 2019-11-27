import java.util.ArrayList;
import java.util.List;

public class Tarefeiro extends FCT {

    Tarefeiro(String nome, int id) {
        super(nome, id);
        salarioBase = 505;
    }

    @Override
    double calcularSalario(String mes) {

        int nrHorasTrabalhadas = 0;
        int nrTarefas = contarTarefas(mes);

        for(Tarefa t : tarefas) {
            if(t.getMes().equals(mes)) {
                nrHorasTrabalhadas = nrHorasTrabalhadas + t.getDuracao();
            }
        }

        double bonus = 0;

        if(nrTarefas > 100 && nrHorasTrabalhadas < 75) {
            bonus = 0.25 * (nrTarefas - 50);
        }
        return salarioBase + 2 * nrHorasTrabalhadas + bonus;
    }
}
