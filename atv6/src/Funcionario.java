public class Funcionario extends Pessoa{
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg, boolean ativo) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = ativo;
    }

    private boolean ativo;

    public void bonificar(double valorBonificacao){
        valorBonificacao = getSalario() + valorBonificacao;
        setSalario(valorBonificacao);
    }

    public void demitir(){
        setAtivo(false);
    }

    public String mostrarDados(){
        return "Departamento: " + getDepartamento() + "\nSalario: " + getSalario() + "\nData de Entrada: " + getDataEntrada() + "\nRG: " + getRg() + "\nEstá Ativo: " + isAtivo();
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
