import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import lucas.entities.PieceLLeft;
public class PieceLLeftTest {
   @Test
    public void testObtenerFormaLIzq(){
        PieceLLeft l=new PieceLLeft();
        char[][] k1= l.getl_left();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][0]);
        assertEquals('.',k1[1][0]);
        assertEquals('.',k1[2][0]);
        assertEquals('.',k1[2][1]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
        /*Ahora Roto a la izquierda */
        l.rotate_left();
        char[][] k2= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', k2[1][0]);
        assertEquals('.', k2[1][1]);
        assertEquals('.', k2[1][2]);
        assertEquals('.', k2[0][2]);
        /*Compruebo valor */
        assertEquals(1,l.getValue_left());
        /*Roto */
        l.rotate_left();

        char[][] l2= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l2[0][0]);
        assertEquals('.', l2[0][1]);
        assertEquals('.', l2[1][1]);
        assertEquals('.', l2[2][1]);
        /*Compruebo valor */
        assertEquals(2,l.getValue_left());
        l.rotate_left();

        char[][] l3= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l3[0][0]);
        assertEquals('.', l3[0][1]);
        assertEquals('.', l3[0][2]);
        assertEquals('.', l3[1][0]);
        /*Compruebo valor */
        assertEquals(3,l.getValue_left());
        l.rotate_left();
        char[][] l5= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l5[0][0]);
        assertEquals('.', l5[1][0]);
        assertEquals('.', l5[2][0]);
        assertEquals('.', l5[2][1]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());

}
    @Test
    public void testObtenerFormaLDer(){
        PieceLLeft l=new PieceLLeft();
        char[][] k1= l.getl_left();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][0]);
        assertEquals('.',k1[1][0]);
        assertEquals('.',k1[2][0]);
        assertEquals('.',k1[2][1]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        char[][] k2= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', k2[0][0]);
        assertEquals('.', k2[0][1]);
        assertEquals('.', k2[0][2]);
        assertEquals('.', k2[1][0]);
        /*Compruebo valor */
        assertEquals(3,l.getValue_left());
        /*Roto */
        l.rotate_right();
        char[][] l2= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l2[0][0]);
        assertEquals('.', l2[0][1]);
        assertEquals('.', l2[1][1]);
        assertEquals('.', l2[2][1]);
        /*Compruebo valor */
        assertEquals(2,l.getValue_left());
        //roto
        l.rotate_right();
        char[][] l3= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l3[0][2]);
        assertEquals('.', l3[1][1]);
        assertEquals('.', l3[1][2]);
        assertEquals('.', l3[1][0]);
        /*Compruebo valor */
        assertEquals(1,l.getValue_left());
        //roto
        l.rotate_right();
        char[][] l4= l.getl_left();
        /*Compruebo matriz */
        assertEquals('.', l4[0][0]);
        assertEquals('.', l4[1][0]);
        assertEquals('.', l4[2][0]);
        assertEquals('.', l4[2][1]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
        
}
@Test
    public void testObtenerFormaLDer_iqz(){
    PieceLLeft l=new PieceLLeft();
        char[][] k1= l.getl_left();
        /*Compruebo Matriz*/
        assertEquals('.',k1[0][0]);
        assertEquals('.',k1[1][0]);
        assertEquals('.',k1[2][0]);
        assertEquals('.',k1[2][1]);
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
        /*Ahora Roto a la derecha */
        l.rotate_right();
        l.rotate_left();
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
        l.rotate_left();
        l.rotate_right();
        /*Compruebo valor */
        assertEquals(0,l.getValue_left());
    }
}
