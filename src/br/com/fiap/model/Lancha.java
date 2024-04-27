package br.com.fiap.model;

public class Lancha extends Veiculo{
    private int quantidadedeMotores;

    public Lancha(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor, int quantidadedeMotores) {
        super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
        this.quantidadedeMotores = quantidadedeMotores;
    }

    public int getQuantidadedeMotores() {
        return quantidadedeMotores;
    }

    public void setQuantidadedeMotores(int quantidadedeMotores) {
        this.quantidadedeMotores = quantidadedeMotores;
    }
}
