import java.util.Scanner;

public class Codigo{
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o titular da conta? ");
        String titularConta = ler.nextLine();
        
        Conta pessoa1 = new Conta();
        pessoa1.setTitular(titularConta);

        System.out.println(pessoa1.getTitular() + " seu saldo é " + pessoa1.getSaldo());
        System.out.println("Deseja depositar? 1 - SIM / 2 - NÃO");
        int vaiDepositar = ler.nextInt();
        if (vaiDepositar == 1){
            System.out.println("Qual o valor que vai depositar? ");
            double valor = ler.nextDouble();
            pessoa1.depositar(valor);
            System.out.println("Seu saldo atual é: R$" + pessoa1.getSaldo());
        } else if (vaiDepositar == 2){
            System.out.println("Obrigada por escolher nossos serviços, até a próxima!");
        } else{
            System.out.println("Valor digitado não confere com as opções, tente novamente!");
        }
        ler.close();
    }
}