import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import lucas.entities.PieceStick;
public class PieceStickTest {
    @Test
    public void testObtenerFormalStick(){
        PieceStick p1 = new PieceStick();
        char[][]p2=p1.getPieceS();
        /*Compruebo Matriz*/
        assertEquals('.',p2[0][0]);
        assertEquals('.',p2[1][0]);
        assertEquals('.',p2[2][0]);
        assertEquals('.',p2[3][0]);
        /*Compruebo valor */
        assertEquals(1,p1.getValue());

        /*Ahora Roto a la izquierda */
        p1.rotate_left();;
        char[][] k2= p1.getPieceS();
        /*Compruebo matriz */
        assertEquals('.', k2[0][0]);
        assertEquals('.', k2[0][1]);
        assertEquals('.', k2[0][2]);
        assertEquals('.', k2[0][3]);
        /*Compruebo valor */
        assertEquals(2,p1.getValue());

        /*Ahora Roto a la izquierda */
        p1.rotate_left();;
        char[][] k3= p1.getPieceS();
        /*Compruebo matriz */
        assertEquals('.', k3[0][0]);
        assertEquals('.', k3[1][0]);
        assertEquals('.', k3[2][2]);
        assertEquals('.', k3[0][3]);
        /*Compruebo valor */
        assertEquals(1,p1.getValue());


    }
}
