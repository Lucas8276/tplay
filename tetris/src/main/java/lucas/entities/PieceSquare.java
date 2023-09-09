package lucas.entities;

public class PieceSquare {
    private char[][] square;
    private int value;
    public  PieceSquare() {
        square= new char[4][4];
        // Dibuja la pieza en forma de "Square"
        square[0][0] = '.';
        square[1][0] = '.';
        square[0][1] = '.';
        square[1][1] = '.';
        value= 0;  
}
public char[][]getPieceSquare(){
    return square;
}
public int getValue(){
    return value;
}
public void rotate_left(){
    switch(value){
        /*Cuadrado volteado xd */
        case 0:
        char[][] t1= new char[4][4];
        t1[0][0]='.';
        t1[1][0]='.';
        t1[0][1]='.';
        t1[1][1]='.';
        value=1;
        break;
        case 1:
        char[][] t2= new char[4][4];
        t2[0][0]='.';
        t2[1][0]='.';
        t2[0][1]='.';
        t2[1][1]='.';
        value=0;
        break;
    }
}
}
