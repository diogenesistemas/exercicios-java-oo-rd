package exercicio03;

// TODO: implemente o código-fonte de OTC.java

public class OTC extends Produto{

    private Double precoPromocional;

    public OTC(int codigoID, String nome, Double precoDeVnda, Double percentualDeDesconto, Double precoPromocional) {
        super(codigoID, nome, precoDeVnda, percentualDeDesconto);
        this.precoPromocional = precoPromocional;
    }

    public Double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}
