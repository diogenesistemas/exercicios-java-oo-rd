package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java

public  class Perfumaria{
    private Double precoPromocional;
    private int quantLMPM;
    private Double precoLMPM;

    public Perfumaria(Double precoPromocional, int quantLMPM, Double precoLMPM) {
        this.precoPromocional = precoPromocional;
        this.quantLMPM = quantLMPM;
        this.precoLMPM = precoLMPM;
    }

    public Double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public int getQuantLMPM() {
        return quantLMPM;
    }

    public void setQuantLMPM(int quantLMPM) {
        this.quantLMPM = quantLMPM;
    }

    public Double getPrecoLMPM() {
        return precoLMPM;
    }

    public void setPrecoLMPM(Double precoLMPM) {
        this.precoLMPM = precoLMPM;
    }
}
