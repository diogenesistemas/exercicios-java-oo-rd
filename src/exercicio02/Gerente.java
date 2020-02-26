package exercicio02;

public class Gerente extends Funcionario{

    // TODO: implemente o código desta classe
    private Double bonusAnualVariavel;

    @Override
    public Double calculaSalarioAnual() {
        return super.calculaSalarioAnual() + bonusAnualVariavel/100*getSalarioMensal();
    }

    public Gerente(String nome, Double salarioMensal, Double bonusAnualVariavel) {
        super(nome, salarioMensal);
        this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public Double getBonusAnualVariavel() {
        return bonusAnualVariavel;
    }
}
