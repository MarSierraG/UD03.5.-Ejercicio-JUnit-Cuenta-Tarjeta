package ies.sotero.hernandez.daw.endes.UD03.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditoTest {

    private Credito credito;


    @BeforeEach
     void setUp() throws Exception {
    	credito = new Credito("1A", "Antonio", new Date(), 1000.0);
    }

    @Test
     void testRetirar() throws Exception {
        credito.retirar(0);
        assertEquals(997,credito.getCreditoDisponible());
    }

    @Test
     void testPagoEnEstablecimiento() throws Exception {
        credito.pagoEnEstablecimiento("Mercadona", 50.0);
        assertEquals(50.0, credito.getSaldo());
    }

    @Test
     void testGetSaldo() {
        assertEquals(0.0, credito.getSaldo());
    }

    @Test
     void testGetCreditoDisponible() {
        assertEquals(1000.0, credito.getCreditoDisponible());
    }

    @Test
     void testLiquidar() throws Exception {
        credito.retirar(30.0);
        credito.pagoEnEstablecimiento("Alcampo", 20.0);


        double saldoAntes = credito.getSaldo();

        credito.liquidar(1, 2022);

        double saldoDespues = credito.getSaldo();
        
        assertEquals(saldoAntes,saldoDespues);
    }
}