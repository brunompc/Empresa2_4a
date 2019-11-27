public class ClienteEmpresarial extends Cliente {

    String nomeResp;
    int telefoneResp;

    @Override
    void mostrarDados() {
        System.out.println(nome);
        System.out.println(nif);
        System.out.println(telefone);
        System.out.println(nomeResp);
        System.out.println(telefoneResp);
    }
}
