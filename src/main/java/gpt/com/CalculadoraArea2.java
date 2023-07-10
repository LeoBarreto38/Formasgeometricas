package gpt.com;

public class CalculadoraArea2 {
    public static void main(String[] args) {
        // Quadrado
        double ladoQuadrado = 5;
        double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
        System.out.println("Area do quadrado: " + areaQuadrado);

        // Retângulo
        double baseRetangulo = 4;
        double alturaRetangulo = 6;
        double areaRetangulo = calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
        System.out.println("Area do retângulo: " + areaRetangulo);

        // Triângulo
        double baseTriangulo = 3;
        double alturaTriangulo = 8;
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Area do triângulo: " + areaTriangulo);

        // Círculo
        double raioCirculo = 2;
        double areaCirculo = calcularAreaCirculo(raioCirculo);
        System.out.println("Area do círculo: " + areaCirculo);
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

