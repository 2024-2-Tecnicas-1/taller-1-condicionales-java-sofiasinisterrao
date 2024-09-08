package test;


/**
 *
 * @author danielsanchez
 */
public class TrianguloTest {
    @Test
    public void testNoValido1() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(1.0, 2.0, 4.0);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoValido2() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(4.0, 10.0, 5.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testIsosceles1() {
        String valorEsperado = "El triángulo es isósceles";
        String valorActual = Triangulo.evaluar(5.0, 5.0, 8.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testIsosceles2() {
        String valorEsperado = "El triángulo es isósceles";
        String valorActual = Triangulo.evaluar(6.0, 4.0, 6.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testEscaleno1() {
        String valorEsperado = "El triángulo es escaleno";
        String valorActual = Triangulo.evaluar(3.0, 5.0, 4.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testEscaleno2() {
        String valorEsperado = "El triángulo es escaleno";
        String valorActual = Triangulo.evaluar(6.0, 7.0, 8.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testEquilatero1() {
        String valorEsperado = "El triángulo es equilátero";
        String valorActual = Triangulo.evaluar(4.0, 4.0, 4.0);
        assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testEquilatero2() {
        String valorEsperado = "El triángulo es equilátero";
        String valorActual = Triangulo.evaluar(7.5, 7.5, 7.5);
        assertEquals(valorEsperado, valorActual);
    }
    
}
