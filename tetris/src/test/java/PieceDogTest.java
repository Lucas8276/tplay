import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

import lucas.entities.PieceDog;
public class PieceDogTest {
    @Test
    public void testObtenerFormaDog(){
        PieceDog p1= new PieceDog();
        char[][] p2= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][0]);
        assertEquals('.',p2[0][1]);
        assertEquals('.',p2[1][1]);
        assertEquals('.',p2[1][2]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());

        /*Ahora roto */
        p1.rotate_left_dogl();

        char[][] p3= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p3[1][0]);
        assertEquals('.',p3[2][0]);
        assertEquals('.',p3[1][1]);
        assertEquals('.',p3[0][1]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuel());




    }
}
