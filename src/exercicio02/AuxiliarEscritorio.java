package exercicio02;

public class AuxiliarEscritorio extends Funcionario{

    // TODO: implemente o código desta classe

    private Double bonusAnual;

    @Override
    public Double calculaSalarioAnual() {
        return super.calculaSalarioAnual()+this.bonusAnual;
    }

    public AuxiliarEscritorio(String nome, Double salarioMensal, Double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }
}
