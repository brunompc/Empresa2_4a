public abstract class Funcionario {

    String nome;
    int salarioBase;
    int id;

    Funcionario(String nome, int id, int salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    abstract double calcularSalario(String mes);

}
