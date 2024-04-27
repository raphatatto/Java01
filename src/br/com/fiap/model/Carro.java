package br.com.fiap.model;

public class Carro extends Veiculo{

    private String placa;
    private float motor=1;
    private int quantidadePortas;


    public Carro(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor, String placa, float motor, int quantidadePortas) {
        super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
        this.placa = placa;
        this.motor = motor;
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
