
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import lucas.entities.PieceDogRight;

public class PieceDogRightTest{
@Test
    public void testObtenerFormaDogDer(){
        PieceDogRight p1= new PieceDogRight();
        char[][] p2= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][3]);
        assertEquals('.',p2[0][2]);
        assertEquals('.',p2[1][1]);
        assertEquals('.',p2[1][2]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());

        /*Ahora roto */
        p1.rotate_right();

        char[][] p3= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p3[0][2]);
        assertEquals('.',p3[1][3]);
        assertEquals('.',p3[1][2]);
        assertEquals('.',p3[2][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuer());

        /*Ahora roto */
        p1.rotate_right();
        char[][] p6= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p6[0][3]);
        assertEquals('.',p6[0][2]);
        assertEquals('.',p6[1][1]);
        assertEquals('.',p6[1][2]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());

    }
    @Test
    public void testObtenerFormaDogIzq(){
        PieceDogRight p1= new PieceDogRight();
        char[][] p2= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][3]);
        assertEquals('.',p2[0][2]);
        assertEquals('.',p2[1][1]);
        assertEquals('.',p2[1][2]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());

        /*Ahora roto */
        p1.rotate_left();

        char[][] p3= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p3[0][2]);
        assertEquals('.',p3[1][3]);
        assertEquals('.',p3[1][2]);
        assertEquals('.',p3[2][3]);
        /*Compruebo valor */
        assertEquals(0,p1.getValuer());

        /*Ahora roto */
        p1.rotate_left();
        char[][] p6= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p6[0][3]);
        assertEquals('.',p6[0][2]);
        assertEquals('.',p6[1][1]);
        assertEquals('.',p6[1][2]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());

    }
    @Test
    public void testObtenerFormaDogDerxd(){
        PieceDogRight p1= new PieceDogRight();
        char[][] p2= p1.getDogR();
        /*Dog a la izquierda */
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][3]);
        assertEquals('.',p2[0][2]);
        assertEquals('.',p2[1][1]);
        assertEquals('.',p2[1][2]);
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());

        /*Ahora roto */
        p1.rotate_right();
        p1.rotate_left();
        
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());
        
        p1.rotate_left();
        p1.rotate_right();
        /*Compruebo valor */
        assertEquals(1,p1.getValuer());
    }

}