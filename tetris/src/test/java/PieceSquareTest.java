import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lucas.entities.PieceSquare;

public class PieceSquareTest {
    @Test
    public void testvoltearsquare(){
        PieceSquare p1= new PieceSquare();
        char[][]k1=p1.getPieceSquare();
        /*Comp valor */
        assertEquals(0,p1.getValue());
        p1.rotate_left();
        char[][] k2= p1.getPieceSquare();
        /*Compruebo matriz */
        assertEquals('.', k2[0][0]);
        assertEquals('.', k2[1][0]);
        assertEquals('.', k2[0][1]);
        assertEquals('.', k2[1][1]);
        /*Compruebo valor */
        assertEquals(1,p1.getValue());
        p1.rotate_left();
        char[][] k3= p1.getPieceSquare();
        /*Compruebo matriz */
        assertEquals('.', k3[0][0]);
        assertEquals('.', k3[1][0]);
        assertEquals('.', k3[0][1]);
        assertEquals('.', k3[1][1]);


    }

}
