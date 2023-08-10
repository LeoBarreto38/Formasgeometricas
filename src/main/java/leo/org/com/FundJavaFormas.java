// 1 - Pacote
package leo.org.com;

// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class FundJavaFormas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // instanciar o objeto de leitura do console


    // 3.2 - Métodos e funções
    public static void main(String[] args) {
        String opcao;
        int area = 0; // receber o resultado dos cáculos de áreas

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");
        System.out.println("(5) - Tabuada");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "5":
                tabuada();
                break;
            default:
                System.out.println("opção inválida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");

            }
            System.out.println(""); // pula de linha
        }
        System.out.println(""); // pula de linha
        return lado * lado; // retorna a área do quadrado
    }


    public static int calcularAreaDoRetangulo() {

        int base;
        int altura;
    }

}
    public static void tabuada(){
        System.out.println("Você quer calcular a tabuada de qual numero?");
        int numero = entrada.nextByte(); // leitura do numero

        for (byte i=1;i<=10;i++) {
            System.out.println(numero * i);
        }
    }

}
