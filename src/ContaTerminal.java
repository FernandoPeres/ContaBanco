import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        //TODO: Conhecer e importar a classe Scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            //Exibir as mensagens para o nosso usuário
            //Obter pela scanner os valores digitados no terminal
            
            System.out.println("Digite a Agência: ");
            String agencia = scanner.nextLine();
    
            System.out.println("Digite o número: ");
            int numero = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Digite o Nome do cliente: ");
            String nome = scanner.nextLine();
    
            System.out.println("Digite o saldo: ");
            double saldo = Double.parseDouble(scanner.nextLine());
    
            //Exibir a mensagem conta criada
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);
            
        } catch (Exception e) {
            System.out.println("erro: "+e);
        }
       
    }
}
