// 1 -Pacote
package leo.org.com;
// 2 - Importação de Bibliotecas

// 3 - Classe
public class Calculoforma {
    // 3.1 Atributos

    // 3.2 Funções e Metodos

    public static int calculoAreaQuadrado(int lado){
        byte ladoQuadrado = 5;

        short area = (short) (lado * lado);
        return area;
    }

    public static int calculoAreaTriangulo(int base, int altura) {
        int area = (base * altura) / 2;
        return area;
    }

    public static int calculoAreaRetangulo(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public static double calculoAreaCirculo(double raio) {
        double area = Math.PI * raio * raio;
        return area;
    }
}
