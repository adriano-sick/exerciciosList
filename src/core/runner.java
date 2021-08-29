package core;

import java.util.Scanner;

public class runner {
    private static Object temperatura;
    private static Object detetiveRobo;

    public static void main(String[] args) {
        var opcao = 0;
        while (opcao != 1 && opcao != 2) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Exercício propostos - Lists");
            System.out.println("Desenvolvido por: Adriano Siqueira\n");
            System.out.println("Você deseja executar qual dos programas?");
            System.out.println("1. Temperatura média");
            System.out.println("2. Detetive-Robô");
            opcao = scan.nextInt();
        }

        if (opcao == 1) {
            core.temperatura.main();
        } else {
            core.detetiveRobo.main();
        }
    }
}
