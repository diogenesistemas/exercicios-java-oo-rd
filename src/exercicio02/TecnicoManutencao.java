package exercicio02;

public class TecnicoManutencao extends Funcionario{

    // TODO: implemente o código desta classe
    private Double adicionalInsalubridadeMensal;
    private  Double bonusAnualFixo;

    public TecnicoManutencao(String nome, Double salarioMensal, Double adicionalInsalubridadeMensal, Double bonusAnualFixo) {
        super(nome, salarioMensal);
        this.adicionalInsalubridadeMensal = adicionalInsalubridadeMensal;
        this.bonusAnualFixo = bonusAnualFixo;
    }

    @Override
    public Double calculaSalarioAnual() {
        return super.calculaSalarioAnual() + (getSalarioMensal()*this.adicionalInsalubridadeMensal/100)*13 + this.bonusAnualFixo;
    }
}
