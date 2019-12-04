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

    String getDescricao() {
        return descricao;
    }

    void mostrar() {
        System.out.println("Descrição " + descricao);
    }

    int calcularPreco() {
        return 500 + 10 * duracao;
    }
}
