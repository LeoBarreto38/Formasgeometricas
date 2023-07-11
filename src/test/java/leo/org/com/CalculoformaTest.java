// 1 - Pacote
package leo.org.com;
// 2 - Bibliotecas

import org.testng.Assert;
import org.testng.annotations.Test;

// 3 - Classe
public class CalculoformaTest {
    // 3.1 - Atributos

    // 3.2 - Atributos
    @Test
    public void testCalculoAreaQuadrado() {
        // Configura - Arrange
        int lado = 5;
        int expectedArea = 25;
        //Executa - Act
        int area = Calculoforma.calculoAreaQuadrado(lado);
        // Valida - Assert
        Assert.assertEquals(area, expectedArea);
    }
    @Test
    public void testCalculoAreaTriangulo() {
        int base = 4;
        int altura = 6;
        int expectedArea = 12;

        int area = Calculoforma.calculoAreaTriangulo(base, altura);

        Assert.assertEquals(area, expectedArea);
    }

    @Test
    public void testCalculoAreaRetangulo() {
        int base = 4;
        int altura = 6;
        int expectedArea = 24;

        int area = Calculoforma.calculoAreaRetangulo(base, altura);

        Assert.assertEquals(area, expectedArea);
    }

    @Test
    public void testCalculoAreaCirculo() {
        double raio = 2;
        double expectedArea = Math.PI * raio * raio;

        double area = Calculoforma.calculoAreaCirculo(raio);

        Assert.assertEquals(area, expectedArea);
    }
}
