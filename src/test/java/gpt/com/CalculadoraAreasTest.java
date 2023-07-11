package gpt.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraAreasTest {

    @Test
    public void testCalcularAreaQuadrado() {
        double lado = 5.0;
        double expectedArea = 25.0;

        double area = CalculadoraAreas.calcularAreaQuadrado(lado);

        Assert.assertEquals(area, expectedArea, "A área calculada para o quadrado está incorreta");
    }

    @Test
    public void testCalcularAreaRetangulo() {
        double base = 4.0;
        double altura = 6.0;
        double expectedArea = 24.0;

        double area = CalculadoraAreas.calcularAreaRetangulo(base, altura);

        Assert.assertEquals(area, expectedArea, "A área calculada para o retângulo está incorreta");
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double base = 3.0;
        double altura = 8.0;
        double expectedArea = 12.0;

        double area = CalculadoraAreas.calcularAreaTriangulo(base, altura);

        Assert.assertEquals(area, expectedArea, "A área calculada para o triângulo está incorreta");
    }

    @Test
    public void testCalcularAreaCirculo() {
        double raio = 2.0;
        double expectedArea = Math.PI * raio * raio;

        double area = CalculadoraAreas.calcularAreaCirculo(raio);

        Assert.assertEquals(area, expectedArea, "A área calculada para o círculo está incorreta");
    }
}
