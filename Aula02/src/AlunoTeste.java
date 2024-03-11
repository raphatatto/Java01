import java.util.Scanner;
public class AlunoTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ler os dados: nome, nota gs, cp e challenge
        System.out.println("Digite o nome:");
        String nome = scanner.next() + scanner.nextLine();
        System.out.println("Digite a nota da gs");
        float gs = scanner.nextFloat();
        System.out.println("Digite a nota da cp");
        float cp = scanner.nextFloat();
        System.out.println("Digite a nota da challenge");
        float challenge = scanner.nextFloat();


        //Calcular e exibir a media do aluno
        void mediaFinal() { System.out.println(nome + " sua média foi calculada..");
        }

    }
}
