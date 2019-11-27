public class Main {
    public static void main(String[] args) {

        Empresa e = new Empresa();

        Funcionario f1 = new Gestor("José Barbosa", 1, 1000);
        Funcionario f2 = new Tarefeiro("Pedro Alves", 2);
        Funcionario f3 = new TecnicoSuporteInformatico("Rute Sofia", 3, 850);

        e.adicionarFuncionario(f1);
        e.adicionarFuncionario(f2);
        e.adicionarFuncionario(f3);

        ClienteIndividual c1 = new ClienteIndividual();

        c1.nome = "Bruno de Carvalho";
        c1.nif = 190000000;
        c1.telefone = 93123123;

        ClienteEmpresarial c2 = new ClienteEmpresarial();

        c2.nome = "MacDonalds";
        c2.nif = 500100200;
        c2.telefone = 964444444;
        c2.nomeResp = "Rodrigo Barnabé";
        c2.telefoneResp = 964444443;

        e.adicionarCliente(c1);
        e.adicionarCliente(c2);

        e.relatorioListaClientes();

    }
}
