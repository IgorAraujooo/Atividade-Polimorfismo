package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void menuComeçar (){
        Scanner scanner = new Scanner(System.in);
        boolean sairDoPrograma = false;

        do {
            System.out.println("--------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1- Criar um círculo");
            System.out.println("2 - Criar um retângulo");
            System.out.println("3 - Sair");
            System.out.println("-----------------------------------------------");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o rai o do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(raioCirculo);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.print("Digite o comprimento do retângulo: ");
                    double comprimentoRetangulo = scanner.nextDouble();
                    System.out.print("Digite a largura do retângulo: ");
                    double larguraRetangulo = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimentoRetangulo, larguraRetangulo);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    break;
                case 3:
                    sairDoPrograma = true;
                    break;
            }

            if (!sairDoPrograma) {
                System.out.print("Deseja escolher outra opção? (S/N): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("N")) {
                    sairDoPrograma = true;
                }
            }
        } while (!sairDoPrograma);
    }
}