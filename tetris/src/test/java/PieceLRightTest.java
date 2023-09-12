import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import lucas.entities.PieceLRight;
public class PieceLRightTest {
    @Test
    public void testObtenerFormaLDer_izq(){
        PieceLRight l=new PieceLRight();
        char[][] k1= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][3]);
        assertEquals('.',k1[1][3]);
        assertEquals('.',k1[2][3]);
        assertEquals('.',k1[2][2]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_right());
        /*Ahora Roto a la izquierda */
        l.rotate_left();
        char[][] k2= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k2[0][1]);
        assertEquals('.',k2[0][2]);
        assertEquals('.',k2[0][3]);
        assertEquals('.',k2[1][3]);
        /*Compruebo valor */
        assertEquals(1,l.getValue_right());
        /*Ahora Roto a la izquierda */
        l.rotate_left();
        char[][] k3= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k3[0][2]);
        assertEquals('.',k3[1][2]);
        assertEquals('.',k3[2][2]);
        assertEquals('.',k3[0][3]);
        /*Compruebo valor */
        assertEquals(2,l.getValue_right());
        /*Ahora Roto a la izquierda */
        l.rotate_left();
        char[][] k4= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k4[0][1]);
        assertEquals('.',k4[1][1]);
        assertEquals('.',k4[1][2]);
        assertEquals('.',k4[1][3]);
        /*Compruebo valor */
        assertEquals(3,l.getValue_right());
        /*Ahora Roto a la izquierda */
        l.rotate_left();
        char[][] k5= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k5[0][3]);
        assertEquals('.',k5[1][3]);
        assertEquals('.',k5[2][3]);
        assertEquals('.',k5[2][2]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_right());
    }
    @Test
    public void testObtenerFormaLDer_der(){
    PieceLRight l=new PieceLRight();
        char[][] k1= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][3]);
        assertEquals('.',k1[1][3]);
        assertEquals('.',k1[2][3]);
        assertEquals('.',k1[2][2]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_right());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        char[][] k2= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k2[0][1]);
        assertEquals('.',k2[1][1]);
        assertEquals('.',k2[1][2]);
        assertEquals('.',k2[1][3]);
        /*Comprue|bo valor */
        assertEquals(3,l.getValue_right());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        char[][] k3= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k3[0][3]);
        assertEquals('.',k3[0][2]);
        assertEquals('.',k3[1][2]);
        assertEquals('.',k3[2][2]);
        /*Compruebo valor */
        assertEquals(2,l.getValue_right());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        char[][] k4= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k4[0][1]);
        assertEquals('.',k4[0][2]);
        assertEquals('.',k4[0][3]);
        assertEquals('.',k4[1][3]);
        /*Compruebo valor */
        assertEquals(1,l.getValue_right());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        char[][] k5= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k5[0][3]);
        assertEquals('.',k5[1][3]);
        assertEquals('.',k5[2][3]);
        assertEquals('.',k5[2][2]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_right());
    }
    @Test
    public void testObtenerFormaLDer_izq_der(){
    PieceLRight l=new PieceLRight();
        char[][] k1= l.getl_right();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][3]);
        assertEquals('.',k1[1][3]);
        assertEquals('.',k1[2][3]);
        assertEquals('.',k1[2][2]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_right());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        l.rotate_left();
        assertEquals(0,l.getValue_right());
    }
}
