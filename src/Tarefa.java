public class Tarefa {

    String descricao;
    int duracao;
    String mes;

    String getMes() {
        return mes;
    }

    int getDuracao() {
        return duracao;
    }
    void mostrar() {
        System.out.println("Descrição " + descricao);
    }
}
