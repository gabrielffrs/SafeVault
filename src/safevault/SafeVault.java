package safevault;

import java.util.Scanner;

public class SafeVault {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idFuncionario, energia, oxigenio, temperatura;

        System.out.println("--- SISTEMA SAFEVAULT: LOGIN ---");
        System.out.print("Digite o ID do funcionário: ");
        idFuncionario = Integer.parseInt(input.nextLine());

        if (idFuncionario == 26090102) {
            System.out.println("Usuário liberado! ");

            System.out.println("------------------------------------");
            System.out.print("Nível de Energia (%): ");
            energia = Integer.parseInt(input.nextLine());

            System.out.print("Nível de Oxigênio (%): ");
            oxigenio = Integer.parseInt(input.nextLine());

            System.out.print("Temperatura atual (°C): ");
            temperatura = Integer.parseInt(input.nextLine());

            System.out.println("\n--- RELATÓRIO DE STATUS ---");

            if (energia < 20) {
                System.out.println("ALERTA: Modo de economia ativado! ");
            }

            if (temperatura > 40) {
                System.out.println("PERIGO: Superaquecimento detectado! ");
            }

            if (oxigenio < 15) { // Ajustei o sinal para < (crítico é quando tem pouco oxigênio!)
                System.out.println("CRÍTICO: Evacuação imediata! ");
            }

            System.out.println("\n--- PAINEL DE PROTOCOLOS ---");
            System.out.println("1 - Incêndio");
            System.out.println("2 - Invasão");
            System.out.println("3 - Falha de Sistema");
            System.out.println("4 - Operação Normal");
            System.out.print("Digite o código do protocolo: ");

            int protocolo = Integer.parseInt(input.nextLine());

            switch (protocolo) {
                case 1:
                    System.out.println("AÇÃO: Ativando sprinklers e trancando portas corta-fogo.");
                    break;
                case 2:
                    System.out.println("AÇÃO: Acionando polícia local e silenciando alarmes externos.");
                    break;
                case 3:
                    System.out.println("AÇÃO: Reiniciando servidores. Mantendo portas abertas para evacuação.");
                    break;
                case 4:
                    System.out.println("AÇÃO: Nenhuma medida necessária. Registrando log de rotina.");
                    break;
                default:
                    System.out.println("ERRO: Código de protocolo inválido! Segurança máxima ativada.");
                    break;
            }

        } else {
            System.out.println("ACESSO NEGADO: ID Inválido.");
        }

        System.out.println("\n--- SISTEMA ENCERRADO ---");
    }
}