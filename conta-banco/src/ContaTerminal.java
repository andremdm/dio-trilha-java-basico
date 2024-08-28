import java.util.Scanner;

public class ContaTerminal {
      public static void main(String[] args) throws Exception {
        
        String usuario = "MARIO ANDRADE";
        Double saldo = 237.48;


        Scanner scanner = new Scanner(System.in);
         System.out.println("Por favor digite o numero da agência!");
          String agencia = scanner.next();

         System.out.println("Por favor digite o numero da conta!");
          int numeroConta = scanner.nextInt();

         System.out.println("Olá " + usuario + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " Conta " + numeroConta + " e seu saldo de " + saldo + " Reais já está disponível para saque!");       




        
    }
}
