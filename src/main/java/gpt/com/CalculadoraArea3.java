package gpt.com;

import java.util.Scanner;
public class CalculadoraArea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica: ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        int opcao = scanner.nextInt();

        double area = 0.0;

        switch (opcao) {
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                area = calcularAreaQuadrado(ladoQuadrado);
                break;
            case 2:
                System.out.println("Digite a base do retângulo: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.println("Digite a altura do retângulo: ");
                double alturaRetangulo = scanner.nextDouble();
                area = calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
                break;
            case 3:
                System.out.println("Digite a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                area = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            case 4:
                System.out.println("Digite o raio do círculo: ");
                double raioCirculo = scanner.nextDouble();
                area = calcularAreaCirculo(raioCirculo);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("A área é: " + area);
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
