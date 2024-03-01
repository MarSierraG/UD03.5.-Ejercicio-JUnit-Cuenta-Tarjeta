package ies.sotero.hernandez.daw.endes.UD03.Cuenta_Tarjeta;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class CuentaTest {
	
	private Cuenta cuenta;

    @BeforeEach
     void setUp() throws Exception {
        cuenta = new Cuenta("1A", "Antonio");
    }

    @Test
     void testIngresar() throws Exception {
        cuenta.ingresar(100.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
     void testRetirar() throws Exception {
        cuenta.ingresar(200.0);
        cuenta.retirar(50.0);
        assertEquals(150.0, cuenta.getSaldo());
    }


    @Test
     void testIngresarConConcepto() throws Exception {
        cuenta.ingresar("VentaBicicleta", 50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
     void testRetirarConConcepto() throws Exception {
        cuenta.ingresar(30.0);
        cuenta.retirar("Alcampo", 20.0);
        assertEquals(10.0, cuenta.getSaldo());
    }
    

}
