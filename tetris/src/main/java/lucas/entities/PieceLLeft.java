package lucas.entities;

public class PieceLLeft {
private char[][]l_left;
private int value_left;

public PieceLLeft(){
        l_left= new char[4][4];
        //Rellena la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        l_left[i][j] = 0;
                    }
            }
        // Dibuja la pieza en forma de "l"horientado a la derecha"
        l_left[0][0] = '.';
        l_left[1][0] = '.';
        l_left[2][0] = '.';
        l_left[2][1] = '.';
        
        //Valor de L-left
        value_left=0;
        
}

public char[][]getl_left(){
    return l_left;
}

public int getValue_left(){
    return value_left;
}


public void rotate_left(){
    switch(value_left){
        //L mirando arriba
        case 0:
        char[][] t1=new char[4][4];
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        t1[0][2] = '.';
        l_left=t1;
        value_left=1;
        break;
        //L mirando al costado
        case 1:
        char[][] t2=new char[4][4];
        t2[0][0] = '.';
        t2[0][1] = '.';
        t2[1][1] = '.';
        t2[2][1] = '.';
        l_left=t2;
        value_left=2;
        break;
        //L mirando abajo
        case 2:
        char[][] t3=new char[4][4];
        t3[0][0] = '.';
        t3[0][1] = '.';
        t3[0][2] = '.';
        t3[1][0] = '.';
        l_left=t3;
        value_left=3;
        break;
        case 3:
        char[][] l9= new char[4][4];
        l9[0][0] = '.';
        l9[1][0] = '.';
        l9[2][0] = '.';
        l9[2][1] = '.';
        l_left=l9;
        value_left=0;
        break;
        }
    }

    public void rotate_right(){
        switch(value_left){
        case 0:
        char[][] t1=new char[4][4];
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][0] = '.';
        l_left=t1;
        value_left=3;
        break;
        //L mirando al costado
        case 3:
        char[][] t2=new char[4][4];
        t2[0][0] = '.';
        t2[0][1] = '.';
        t2[1][1] = '.';
        t2[2][1] = '.';
        l_left=t2;
        value_left=2;
        break;
        //L mirando abajo
        case 2:
        char[][] t3=new char[4][4];
        t3[0][2] = '.';
        t3[1][1] = '.';
        t3[1][2] = '.';
        t3[1][0] = '.';
        l_left=t3;
        value_left=1;
        break;
        case 1:
        char[][]t9=new char[4][4];
        t9[0][0] = '.';
        t9[1][0] = '.';
        t9[2][0] = '.';
        t9[2][1] = '.';
        l_left=t9;
        value_left=0;
        break;
        }
}

}
/*  formas xd
        Lright
        L mirando arriba
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        t1[0][2] = '.';
        L mirando al costado
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[1][1] = '.';
        t1[2][1] = '.';
        L mirando abajo
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][0] = '.';
        L de nuevo normal
        l1[0][0] = '.';
        l1[1][0] = '.';
        l1[2][0] = '.';
        l1[2][1] = '.';


        L.right
        L mirando abajo
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][2] = '.';
        L mirando al costado
        t1[0][1] = '.';
        t1[1][1] = '.';
        t1[2][1] = '.';
        t1[0][2] = '.';
        L mirando arriba
        t1[0][0] = '.';
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        L normal de nuevo
        l2[0][3] = '.';
        l2[1][3] = '.';
        l2[2][3] = '.';
        l2[2][2] = '.';
 */