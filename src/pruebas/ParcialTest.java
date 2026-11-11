package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import logica.Parcial;

public class ParcialTest

{

    private Parcial parcial;

    @BeforeEach
    void preparar()
    {

        parcial = new Parcial();
    }

    @Test
    void raicesReales() throws Exception
    {

        //x^2 - 5x + 6 = 0 tiene raíces 3.0 y 2.0
        String resultado = parcial.raices(1, -5, 6);
        assertEquals("x=3.0 , x=2.0", resultado);
    }

    @Test
    void raizComplejaExcepcion()
    {

        //x^2 + 1 = 0 tiene raiz compleja
        Exception e = assertThrows(Exception.class, () -> parcial.raices(1, 0, 1));
        assertEquals("La raiz es compleja", e.getMessage());
    }

    @Test
    void noEsEcuacionSegundoGradoExcepcion()
    {

        // Caso a = 0. no se puede porque en la cuadratica dividimos por 0, y la ecuacion no seria de seundo orden 
        Exception e = assertThrows(Exception.class, () -> parcial.raices(0, 2, 3));
        assertEquals("No es una ecuacion de segundo orden", e.getMessage());
    }
}
