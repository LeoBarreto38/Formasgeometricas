// 1 - Pacote
package leo.org.com;

// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class FundJavaFormas {
    // 3.1 - Atributos
        static Scanner entrada = new Scanner(System.in); // instanciar o objeto de leitura do console


    // 3.2 - Métodos e funções
    public static void main(String[] args){
        String opcao;
        int area = 0; // receber o resultado dos cáculos de áreas

        System.out.println("Escolha o Cálculo Deejado");
        System.out.println("(1) - Area do quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;

            default:
                System.out.println("opção inválida: " + opcao);
        }
        if (area > 0) {
            System.out.println("A área é " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a área do quadrado
    }

}
