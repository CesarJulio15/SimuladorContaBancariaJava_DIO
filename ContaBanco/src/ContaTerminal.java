import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Scanner para ler do terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   BEM-VINDO AO BANCO JAVA       ");
        System.out.println("==================================");

        // 1) Agência (texto)
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine().trim();

        // 2) Número da conta (inteiro)
        System.out.print("Por favor, digite o número da Conta: ");
        String numeroEntrada = scanner.nextLine().trim();
        int numero = Integer.parseInt(numeroEntrada);

        // 3) Nome do cliente (texto)
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine().trim();

        // 4) Saldo (decimal)
        System.out.print("Por favor, digite o saldo: ");
        String saldoEntrada = scanner.nextLine().trim().replace(",", ".");
        double saldo = Double.parseDouble(saldoEntrada);

        // Montagem da mensagem com concatenação (incluindo String.concat)
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.format("R$ %.2f", saldo))
                .concat(" já está disponível para saque.");

        // Saída final
        System.out.println();
        System.out.println(mensagem);
        System.out.println("==================================");

        scanner.close();
    }
}
