package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Cafeteira;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cafeteira caf = new Cafeteira();
        int opcao = 0;

        System.out.println("Bem-vindo à Smart Coffee Maker!");

        while (opcao != 5) {

            System.out.println();
            System.out.println("----- STATUS ATUAL -----");
            System.out.println(caf);
            System.out.println("------------------------");

            System.out.println("1 - Ligar / Desligar");
            System.out.println("2 - Abastecer Água");
            System.out.println("3 - Abastecer Pó");
            System.out.println("4 - Fazer Café");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Erro: Por favor, digite um número.");
                sc.next(); 
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Ação selecionada: Botão Power");
            
                    System.out.print("Deseja [1] Ligar ou [2] Desligar? ");
                    int powerOp = sc.nextInt();
                    if (powerOp == 1)
                        caf.ligar();
                    else if (powerOp == 2)
                        caf.desligar();
                    else
                        System.out.println("Opção inválida.");
                    break;

                case 2:
                    System.out.print("Digite a quantidade de água (ml): ");
                    int qtdAgua = sc.nextInt();
                    
                    caf.abastecerAgua(qtdAgua);
                    System.out.println("Processando abastecimento...");
                    break;

                case 3:
                    System.out.print("Digite a quantidade de pó (g): ");
                    int qtdPo = sc.nextInt();
                    
                    caf.abastecerPo(qtdPo);
                    break;

                case 4:
                    System.out.println("Iniciando preparo...");
                    caf.fazerCafe();
                    break;

                case 5:
                    System.out.println("Encerrando... Tenha um ótimo dia cafeinado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}