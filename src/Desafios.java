import java.util.Random;
import java.util.Scanner;

public class Desafios {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroCerto = new Random().nextInt(100);
        int chute = 0;
        int tentativas = 5;

        // Loop principal e incrementação das tentativas.
        while(chute != numeroCerto){
            System.out.println("Tente acertar o número aleatório de 1 a 100 em apenas 5 tentativas!:");
            chute = scan.nextInt();
            tentativas--;

            // Verificação das tentativas restantes.
            if(tentativas <= 0){
                System.out.println("Você perdeu! Tentativas esgotadas!");
                break;
            }

            // Verificação dos limites de número possíveis para escolha e verificações de proximidade do número correto.
            if (chute < 0 || chute > 100) {
                System.out.println("Por favor, digite um número de 0 a 100.");
                System.out.println("Tentativas restantes: " + tentativas);
            }else if(chute < numeroCerto){
                System.out.println("Errou! Tente um número maior");
                System.out.println("Tentativas restantes: " + tentativas);
            } else if (chute > numeroCerto) {
                System.out.println("Errou! Tente um número menor");
                System.out.println("Tentativas restantes: " + tentativas);
            }
            }
        // Parabenização  do usuário caso ele tenha acertado o número.
        System.out.println("Parabéns! O número correto era " + numeroCerto);
        }
    }
