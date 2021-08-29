//Adriano Siqueira - 08/27/2021 - Exercícios Propostos-List - Exercício-1
//recebe temperatura media dos 6 primeiros meses e armazena numa lista
//calcular media mensal, e mostrar todas as temperaturas acima da media, e em que mes ocorreram(mes por extenso)

package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class temperatura {
    public static void main() {
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));
        List<Double> temperaturas = new ArrayList<>();
        double soma = 0d;
        int i = 0;

        while (temperaturas.size() < meses.size()){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a temperatura do mês de " + meses.get(temperaturas.size()));
            temperaturas.add(scan.nextDouble());
        }

        for (Double temp : temperaturas){
            soma += temp;
        }

        System.out.println("Média de temperatura do primeiro semetre: " + " " + Math.ceil((soma / meses.size())));
        System.out.printf("Meses com temperatura acima da média:");

        while (i < meses.size()) {
            if (temperaturas.get(i) > soma / temperaturas.size()) System.out.printf(" " + meses.get(i));
            i++;
        }
    }
}

