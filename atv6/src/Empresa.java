import java.util.ArrayList;

public class Empresa {
    private String cnpj,nomeEmpresa;
    private int qtd_de_funcionario;
    Funcionario[] funcionarios;
    private static int i = 0;

    public Empresa(String cnpj, String nomeEmpresa, int qtd_de_funcionario) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        if (qtd_de_funcionario <= 100){
            this.qtd_de_funcionario = qtd_de_funcionario;
            funcionarios = new Funcionario[qtd_de_funcionario];
        } else {
            this.qtd_de_funcionario = 100;
            funcionarios = new Funcionario[100];
        }
    }

    public void insereFuncionario (Funcionario func){
        funcionarios[i] = func;
        i++;

    }
}
