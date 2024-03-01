package ies.sotero.hernandez.daw.endes.UD03.Cuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	private Movimiento movimiento;

	@BeforeEach
     void setUp() throws Exception {
		movimiento = new Movimiento();
    }

    @Test
     void testGetImporte() {
        assertEquals(0.0, movimiento.getImporte());
    }

    @Test
     void testGetConcepto() {
        assertNull(movimiento.getConcepto());
    }

    @Test
     void testSetConcepto() {
    	movimiento.setConcepto("Alcampo");
        assertEquals("Alcampo", movimiento.getConcepto());
    }

    @Test
     void testGetFecha() {
        assertNotNull(movimiento.getFecha());
    }

    @Test
     void testSetFecha() {
        Date fecha = new Date();
        movimiento.setFecha(fecha);
        assertEquals(fecha, movimiento.getFecha());
    }

    @Test
     void testSetImporte() {
    	movimiento.setImporte(300.0);
        assertEquals(300.0, movimiento.getImporte());
    }

}
