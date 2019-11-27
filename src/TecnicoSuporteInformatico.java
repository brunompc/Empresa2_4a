public class TecnicoSuporteInformatico extends Funcionario {

    TecnicoSuporteInformatico(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    @Override
    double calcularSalario(String mes) {
        return salarioBase;
    }

}
