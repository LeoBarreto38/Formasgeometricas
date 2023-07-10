package leo.org.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Óla Leonardo Barreto!");
        chamarCalculoforma();
    }
    public static void chamarCalculoforma() {
        int lado = 5;
        int baseTriangulo = 4;
        int alturaTriangulo = 3;
        int baseRetangulo = 6;
        int alturaRetangulo = 4;
        double raioCirculo = 2.6;

        int areaQuadrado = Calculoforma.calculoAreaQuadrado(lado);
        int areaTriangulo = Calculoforma.calculoAreaTriangulo(baseTriangulo, alturaTriangulo);
        int areaRetangulo = Calculoforma.calculoAreaRetangulo(baseRetangulo, alturaRetangulo);
        double areaCirculo = Calculoforma.calculoAreaCirculo(raioCirculo);

        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do triângulo é: " + areaTriangulo);
        System.out.println("A área do retângulo é: " + areaRetangulo);
        System.out.println("A área do circulo é: " + areaCirculo);

    }
}
