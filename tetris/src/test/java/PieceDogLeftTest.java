import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

import lucas.entities.PieceDogLeft;
public class PieceDogLeftTest {
    @Test
    public void testObtenerFormaDogizq(){
        PieceDogLeft p1= new PieceDogLeft();
        char[][] p2= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][0]);
        assertEquals('.',p2[0][1]);
        assertEquals('.',p2[1][2]);
        assertEquals('.',p2[1][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());

        /*Ahora roto */
        p1.rotate_left();
        char[][] p3= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p3[0][1]);
        assertEquals('.',p3[1][1]);
        assertEquals('.',p3[1][0]);
        assertEquals('.',p3[2][0]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuel());

        /*Ahora roto */
        p1.rotate_left();
        char[][] p9= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p9[0][0]);
        assertEquals('.',p9[0][1]);
        assertEquals('.',p9[1][2]);
        assertEquals('.',p9[0][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());
    }
    @Test
    public void testObtenerFormaDogder(){
        PieceDogLeft p1= new PieceDogLeft();
        char[][] p2= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][0]);
        assertEquals('.',p2[0][1]);
        assertEquals('.',p2[1][2]);
        assertEquals('.',p2[1][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());

        /*Ahora roto */
        p1.rotate_right();
        char[][] p3= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p3[0][1]);
        assertEquals('.',p3[1][1]);
        assertEquals('.',p3[1][0]);
        assertEquals('.',p3[2][0]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuel());

        /*Ahora roto */
        p1.rotate_right();
        char[][] p9= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p9[0][0]);
        assertEquals('.',p9[0][1]);
        assertEquals('.',p9[1][2]);
        assertEquals('.',p9[0][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());
    }
    @Test
    public void testObtenerFormaDog_izq_der(){
        PieceDogLeft p1= new PieceDogLeft();
        char[][] p2= p1.getDogL();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][0]);
        assertEquals('.',p2[0][1]);
        assertEquals('.',p2[1][2]);
        assertEquals('.',p2[1][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());

        /*Ahora roto */
        p1.rotate_left();
        /*Ahora roto */
        p1.rotate_right();
        /*Compruebo valor */
        assertEquals(0,p1.getValuel());
    }
}
