package ies.sotero.hernandez.daw.endes.UD03.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DebitoTest {

    private Debito debito;
    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
    	
        cuenta = new Cuenta("1A", "Antonio");
        debito = new Debito("2J", "Juan", new Date());
        
        debito.setCuenta(cuenta);
    }
    
    @AfterEach
    public void tearDown() {
        cuenta = null;
        debito = null;    
    }

    @Test
    public void testRetirar() throws Exception {
        cuenta.ingresar(100.0);
        debito.retirar(50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        cuenta.ingresar(60.0);
        debito.pagoEnEstablecimiento("Alcampo", 59.0);
        assertEquals(1.0, cuenta.getSaldo());
    }

    @Test
    public void testGetSaldo() throws Exception {
        cuenta.ingresar(30.0);
        assertEquals(30.0, debito.getSaldo());
    }

    @Test
    public void testSetCuenta() {
        Cuenta cuenta2 = new Cuenta("3P", "Pablo");
        debito.setCuenta(cuenta2);
        assertEquals(cuenta2.getSaldo(), debito.getSaldo());
    }
    
    @Test
    public void testIngresar() throws Exception {
    	 cuenta.ingresar(60.0);
         debito.pagoEnEstablecimiento("Alcampo", 59.0);
         assertEquals(1.0, cuenta.getSaldo());
        
    }
    
}