public class Conta {
    private double saldo;
    public String numero;
    private boolean statusCheckEspecial = false;
    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if(statusCheckEspecial){
            saldo -= valor;
        } else
         if (saldo < valor)
            System.out.println("Voce ta liso");
        else {
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!");

        }

    }
}

