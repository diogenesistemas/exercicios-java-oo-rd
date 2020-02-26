package exercicio03;

// TODO: implemente o código-fonte de Produto.java

public class Produto{
    private int  codigoID;
    private String nome;
    private  Double precoDeVnda;
    private Double percentualDeDesconto;

    public Produto(int codigoID, String nome, Double precoDeVnda, Double percentualDeDesconto) {
        this.codigoID = codigoID;
        this.nome = nome;
        this.precoDeVnda = precoDeVnda;
        this.percentualDeDesconto = percentualDeDesconto;
    }

    public int getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoDeVnda() {
        return precoDeVnda;
    }

    public void setPrecoDeVnda(Double precoDeVnda) {
        this.precoDeVnda = precoDeVnda;
    }

    public Double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(Double percentualDeDesconto) {
        this.percentualDeDesconto = percentualDeDesconto;
    }
}
