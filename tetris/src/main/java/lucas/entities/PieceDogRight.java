package lucas.entities;

public class PieceDogRight {
private char[][]dog_right;
private int valued;
public PieceDogRight(){
     //Perro a la derecha
     dog_right=new char[4][4];
     //Rellena la matriz
     for (int i = 0; i < 4; i++) {
     for (int j = 0; j < 4; j++) {
     dog_right[i][j] = 0;
             }
     }
     // Dibuja la pieza en forma de "Dog" horientado a la derecha"
     dog_right[0][3] = '.';
     dog_right[0][2] = '.';
     dog_right[1][1] = '.';
     dog_right[1][2] = '.';
     valued=1; 
}
public char[][]getDogR(){
    return dog_right;
}
public int getValuer(){
    return valued;
}
public void rotate_left(){
    switch(valued){
    //Perro a la izquierda
    case 1:
    char[][] d4 = new char[4][4];
    // Dibuja la pieza en forma de "Dog"  ver"
    d4[0][2] = '.';
    d4[1][3] = '.';
    d4[1][2] = '.';
    d4[2][3] = '.';
    dog_right=d4;
    valued=0;
    break;
    case 0:
    char[][] d2 = new char[4][4];
    // Dibuja la pieza en forma de "Dog" hori"
    d2[0][3] = '.';
    d2[0][2] = '.';
    d2[1][1] = '.';
    d2[1][2] = '.';
    dog_right=d2;
    valued=1;
    break;
            }
    }
public void rotate_right(){
        switch(valued){
        //Perro a la izquierda
        case 1:
        char[][] d8 = new char[4][4];
        // Dibuja la pieza en forma de "Dog"  verti
        d8[0][2] = '.';
        d8[1][3] = '.';
        d8[1][2] = '.';
        d8[2][3] = '.';
        dog_right=d8;
        valued=0;
        break;
        case 0:
        char[][] d9 = new char[4][4];
        // Dibuja la pieza en forma de "Dog" horizon"
        d9[0][3] = '.';
        d9[0][2] = '.';
        d9[1][1] = '.';
        d9[1][2] = '.';
        dog_right=d9;
        valued=1;
        break;
                }
        }
}

