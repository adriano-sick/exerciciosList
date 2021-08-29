//Adriano Siqueira - 08/27/2021 - Exercícios Propostos-List - Exercício-2
//Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. perguntas:
//1. "Telefonou para a vítima?"
//2. "Esteve no local do crime?"
//3. "Mora perto da vítima?"
//4. "Devia para a vítima?"
//5. "Já trabalhou com a vítima?"
//Se a pessoa responder S para duas questoes ela sera classificada como "Suspeita", 3 ou 4 "cumplice" 5 "assassina" 0 ou 1 "Inocente"

package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class detetiveRobo {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>(Arrays.asList("Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"));

        List<String> respostas = new ArrayList<>(Arrays.asList());

        System.out.println("\n" +
                "  _____       _       _   _                  _____       _      //\\  \n" +
                " |  __ \\     | |     | | (_)                |  __ \\     | |    |/ \\| \n" +
                " | |  | | ___| |_ ___| |_ ___   _____ ______| |__) |___ | |__   ___  \n" +
                " | |  | |/ _ \\ __/ _ \\ __| \\ \\ / / _ \\______|  _  // _ \\| '_ \\ / _ \\ \n" +
                " | |__| |  __/ ||  __/ |_| |\\ V /  __/      | | \\ \\ (_) | |_) | (_) |\n" +
                " |_____/ \\___|\\__\\___|\\__|_| \\_/ \\___|      |_|  \\_\\___/|_.__/ \\___/ \n" +
                "                                                                     \n" +
                "                                                                     \n");
        System.out.println("Respondas as questoes com 's' para positivo, e 'n' para Negativo.");
        System.out.println("Outras resposta NÃO serão aceitas, não tente se justificar!");
        System.out.println("Pressione enter quando estiver pronto!");
        scan.nextLine();

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            var resposta = scan.nextLine();

            while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
                System.out.println("Responda sim ou nao! " + pergunta);
                resposta = scan.nextLine();
            }

            if (resposta.equalsIgnoreCase("s")) {
                respostas.add(pergunta);
            }
        }

        if (respostas.size() == 5) {
            System.out.println("Você respondeu positivamente as seguntes perguntas: \n" + respostas);
            System.out.println("  _________________________\n" +
                    "     ||   ||     ||   ||\n" +
                    "     ||   ||, , ,||   ||\n" +
                    "     ||  (||/|/(\\||/  ||\n" +
                    "     ||  ||| _'_`|||  ||\n" +
                    "     ||   || o o ||   ||\n" +
                    "     ||  (||  - `||)  ||\n" +
                    "     ||   ||  =  ||   ||\n" +
                    "     ||   ||\\___/||   ||\n" +
                    "     ||___||) , (||___||\n" +
                    "    /||---||-\\_/-||---||\\\n" +
                    "   / ||--_||_____||_--|| \\\n" +
                    "  (_(||)-| S123-45 |-(||)_)\n" +
                    "|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n" +
                    "| \" Você é o assassino!!!  |\n" +
                    "|'Teje preso cabra safado!!!|\n" +
                    "|=========================\" |\n" +
                    " \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        } else if (respostas.size() >= 3) {
            System.out.println("Você respondeu positivamente as seguntes perguntas: " + respostas);
            System.out.println("Você foi cumplice de um assassinato!!! Teje preso cabra safado!!!");
        } else if (respostas.size() == 2) {
            System.out.println("Você respondeu positivamente as seguntes perguntas: " + respostas);
            System.out.println("Não tenho provas, ainda! E convicção não pode mandar ngm pra cadeia. Suspeito!");
        } else {
            System.out.println("Você respondeu positivamente as seguntes perguntas: " + respostas);
            System.out.println("Você é inocente, some daqui!");
        }
    }
}

