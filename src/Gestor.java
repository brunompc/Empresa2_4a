import java.util.ArrayList;
import java.util.List;

public class Gestor extends FCT {

    Gestor(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    double calcularSalario(String mes) {

        int nrTarefasGeridas = contarTarefas(mes);

        return salarioBase + 0.5 * nrTarefasGeridas;
    }
}
