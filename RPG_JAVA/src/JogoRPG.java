import models.Heroi;
import models.Inimigo;

import java.util.Scanner;


public class JogoRPG {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Pinu", 100, 10);
        Inimigo inimigo = new Inimigo("Poluidor", 200);

        System.out.println("Bem vindo às Aventuras de Pinu!");
        System.out.println("Você é o herói Pinu! Pronto para salvar a grande metrópole?");
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Ataque básico");
            System.out.println("2 - Gritar em pânico");
            System.out.println("3 - Usar conhecimentos");
            System.out.println("4 - Cura");

            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        heroi.ataqueBasico(inimigo);
                        break;
                    case 2:
                        heroi.ataqueGrito(inimigo);
                        break;
                    case 3:
                        heroi.ataqueEfetivo(inimigo);
                        break;
                    case 4:
                        heroi.curar();
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");
                        continue;
                }

                if (inimigo.getVida() <= 0) {
                    System.out.println("\nVocê conseguiu!");
                    break;
                }

                inimigo.atacar(heroi);
                if (heroi.getVida() <= 0) {
                    System.out.println("Você falhou!");
                    break;
                }
            } else {
                System.out.println("Opção inválida. Insira um número inteiro.");
                scanner.nextLine();
            }
        } while (true);
        scanner.close();
    }
}
