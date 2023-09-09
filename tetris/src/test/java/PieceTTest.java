
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

import lucas.entities.Piecet;
public class PieceTTest {
    @Test
    public void testObtenerFormaizq() {
        Piecet pieza_t = new Piecet();
        char[][] k1= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k1[0][0]);
        assertEquals('.', k1[0][1]);
        assertEquals('.', k1[0][2]);
        assertEquals('.', k1[1][1]);
        /*Compruebo valor */
        assertEquals(1,pieza_t.getValue());
        /*Ahora Roto a la izquierda */
        pieza_t.rotate_left();
        char[][] k2= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k2[0][3]);
        assertEquals('.', k2[1][3]);
        assertEquals('.', k2[2][3]);
        assertEquals('.', k2[1][2]);
        /*Compruebo valor */
        assertEquals(2,pieza_t.getValue());
        /*Ahora roto a la izquierda */
        pieza_t.rotate_left();
        char[][] k3= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k3[1][0]);
        assertEquals('.', k3[1][1]);
        assertEquals('.', k3[1][2]);
        assertEquals('.', k3[0][1]);
        /*Compruebo valor */
        assertEquals(3,pieza_t.getValue());
        pieza_t.rotate_left();
        char[][] k4= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k4[0][3]);
        assertEquals('.', k4[1][3]);
        assertEquals('.', k4[1][2]);
        assertEquals('.', k4[2][3]);
        /*Compruebo valor */
        assertEquals(4,pieza_t.getValue());
        pieza_t.rotate_left();
        char[][] k5= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k5[0][0]);
        assertEquals('.', k5[0][1]);
        assertEquals('.', k5[1][1]);
        assertEquals('.', k5[0][2]);
        /*Compruebo valor */
        assertEquals(1,pieza_t.getValue());

                                        }
        @Test
        public void testObtenerFormader() {
        Piecet pieza_t = new Piecet();
        char[][] k1= pieza_t.getPiecet();
        
        /*Compruebo valor */
        assertEquals(1,pieza_t.getValue());
        /*Ahora Roto a la izquierda */
        pieza_t.rotate_right();
        char[][] k2= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k2[0][2]);
        assertEquals('.', k2[1][2]);
        assertEquals('.', k2[2][2]);
        assertEquals('.', k2[1][1]);
        /*Compruebo valor */
        assertEquals(2,pieza_t.getValue());
        /*Ahora roto a la izquierda */
        pieza_t.rotate_right();
        char[][] k3= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k3[1][0]);
        assertEquals('.', k3[1][1]);
        assertEquals('.', k3[1][2]);
        assertEquals('.', k3[0][1]);
        /*Compruebo valor */
        assertEquals(3,pieza_t.getValue());
        pieza_t.rotate_right();
        char[][] k7= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k7[0][0]);
        assertEquals('.', k7[1][0]);
        assertEquals('.', k7[2][0]);
        assertEquals('.', k7[1][1]);
        /*Compruebo valor */
        assertEquals(4,pieza_t.getValue());
        pieza_t.rotate_right();
        char[][] k9= pieza_t.getPiecet();
        /*Compruebo matriz */
        assertEquals('.', k9[0][0]);
        assertEquals('.', k9[0][1]);
        assertEquals('.', k9[1][1]);
        assertEquals('.', k9[0][2]);
        /*Compruebo valor */
        assertEquals(1,pieza_t.getValue());
                                        }
}
    
    

