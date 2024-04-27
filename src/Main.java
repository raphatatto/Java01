import br.com.fiap.model.Carro;
import br.com.fiap.model.Cor;
import br.com.fiap.model.Veiculo;

public class Main {
    public static void main(String[] args){
    Cor cor = new Cor("Vermelho",12,65,30);
    Carro carro = new Carro("Corsa",4,30.5,2024,cor,"FVG1234",1,4);

        System.out.println(carro.getModelo() + " " + carro.getCor().getNome());

    }
}