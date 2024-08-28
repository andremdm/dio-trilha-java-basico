import java.util.Scanner;

public class ContaTerminal {
      public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite seu Nome:");
          String nomeCliente = scanner.next();

         System.out.println("Por favor digite o numero da agência:(067-8)");
          String agencia = scanner.next();

         System.out.println("Por favor digite o numero da conta:(1021)");
          int numeroConta = scanner.nextInt();

         System.out.println("Por favor digite o saldo da conta:");
          Double saldo = scanner.nextDouble();

         System.out.println("Olá ".concat(nomeCliente) + 
           "! Obrigado por criar uma conta em nosso banco, agência ".concat(agencia) + 
           " conta nº " + numeroConta + " e seu saldo de " + saldo + " Reais já está disponível para saque!");
                              
         scanner.close();
     
    }
}
