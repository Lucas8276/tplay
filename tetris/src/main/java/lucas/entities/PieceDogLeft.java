package lucas.entities;

public class PieceDogLeft {
private char[][]dog_left;
private int valuel;

public  PieceDogLeft() {
        dog_left = new char[4][4];
        //Rellena la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        dog_left[i][j] = 0;
                }
        }
         // Dibuja la pieza en forma de "Dog"  horientado a la izquierda"
        dog_left[0][0] = '.';
        dog_left[0][1] = '.';
        dog_left[1][2] = '.';
        dog_left[1][3] = '.';
        valuel=0;
}
        public char[][]getDogL(){
        return dog_left;
}

        public int getValuel(){
        return valuel;
}

public void rotate_left(){
        switch(valuel){
        //Perro a la izquierda
        case 0:
        char[][] d3 = new char[4][4];
        // Dibuja la pieza en forma de "Dog"  horientado a la izquierda"
        d3[0][1] = '.';
        d3[1][1] = '.';
        d3[1][0] = '.';
        d3[2][0] = '.';
        dog_left=d3;
        valuel=1;
        break;
        case 1:
        char[][] d4 = new char[4][4];
        // Dibuja al perro vertical de nuevo
        d4[0][0] = '.';
        d4[0][1] = '.';
        d4[1][2] = '.';
        d4[0][3] = '.';
        dog_left=d4;
        valuel=0;
        break;
                }
        }


        public void rotate_right(){
        switch(valuel){
               //Perro a la izquierda
        case 0:
        char[][] d5 = new char[4][4];
        // Dibuja la pieza en forma de "Dog"  horientado a la izquierda"
        d5[0][1] = '.';
        d5[1][1] = '.';
        d5[1][0] = '.';
        d5[2][0] = '.';
        dog_left=d5;
        valuel=1;
        break;
        case 1:
        char[][] d6 = new char[4][4];
        // Dibuja la pieza en forma de "Dog" horientado a la derecha"
        d6[0][0] = '.';
        d6[0][1] = '.';
        d6[1][2] = '.';
        d6[0][3] = '.';
        dog_left=d6;
        valuel=0;
        break; 
        }
        }
        
}


/* 
public  char[][] create_dog_left_vertical() {
        char[][] d3 = new char[4][4];
        // Dibuja la pieza en forma de "Dog"  horientado a la izquierda"
        d3[1][0] = '.';
        d3[2][0] = '.';
        d3[1][1] = '.';
        d3[0][1] = '.';
        return d3;  
}

public  char[][] create_dog_right() {
        char[][] d2 = new char[4][4];
        // Dibuja la pieza en forma de "Dog" horientado a la derecha"
        d2[0][3] = '.';
        d2[0][2] = '.';
        d2[1][1] = '.';
        d2[1][2] = '.';
        return d2;  
}
public  char[][] create_dog_right_vertical() {
        char[][] d4 = new char[4][4];
        // Dibuja la pieza en forma de "Dog"  horientado a la izquierda"
        d4[0][2] = '.';
        d4[1][3] = '.';
        d4[1][2] = '.';
        d4[2][3] = '.';
        return d4;  
}
}*/
