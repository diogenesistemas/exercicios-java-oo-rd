package exercicio02;

public abstract class Funcionario {

    // TODO: implemente o código desta classe
    private String nome;
    private Double salarioMensal;

    public Double calculaSalarioAnual(){
        return this.salarioMensal * 13;
    }


    public Funcionario(String nome, Double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
