package gpt.com;
public class CalculadoraArea2 {
    public static void main(String[] args) {
        double ladoQuadrado = 5;
        double areaQuadrado = CalculadoraAreas.calcularAreaQuadrado(ladoQuadrado);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double baseRetangulo = 4;
        double alturaRetangulo = 6;
        double areaRetangulo = CalculadoraAreas.calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
        System.out.println("Area do retângulo: " + areaRetangulo);

        double baseTriangulo = 3;
        double alturaTriangulo = 8;
        double areaTriangulo = CalculadoraAreas.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Area do triângulo: " + areaTriangulo);

        double raioCirculo = 2;
        double areaCirculo = CalculadoraAreas.calcularAreaCirculo(raioCirculo);
        System.out.println("Area do círculo: " + areaCirculo);
    }
}

