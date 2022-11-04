import java.util.Scanner;
public class Principal {
    public void main(String [] args){
        String nome,cnpj,nomeEmp,email,telefone,departamento,dataEntrada,RG;
        double salario;
        int qtdFunc;
        boolean status;
        Scanner ler = new Scanner(System.in);

        Funcionario[] functionarios = new Funcionario[10];

        for (int i=0; i < 10; i++){
            System.out.println("Digite email, telefone, departamento, A data de entrada, RG, Salário,");
            nome = ler.nextLine();
            email = ler.nextLine();
            telefone = ler.nextLine();
            departamento = ler.nextLine();
            dataEntrada = ler.nextLine();
            RG = ler.nextLine();
            salario = ler.nextDouble();
            status = ler.nextBoolean();
            Funcionario func = new Funcionario(nome,email,telefone,departamento,salario,dataEntrada, RG,status);

        }
        System.out.println("Digite o nome da empresa");
        nomeEmp = ler.nextLine();
        System.out.println("Digite o CNPJ da empresa");
        cnpj = ler.nextLine();
        System.out.println("Digite a quantidade de funcionários da empresa");
        qtdFunc = ler.nextInt();

        Empresa empresa = new Empresa(cnpj, nomeEmp, qtdFunc);

        for (Funcionario func1:functionarios){
            empresa.insereFuncionario(func1);
            System.out.println(func1.mostrarDados());
        }
    }
}
