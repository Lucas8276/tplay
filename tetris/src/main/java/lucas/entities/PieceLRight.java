package lucas.entities;

public class PieceLRight {
private char[][]l_right;
private int value_right;
public PieceLRight(){
    l_right=new char[4][4];
        //Rellena la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        l_right[i][j] = 0;
                    }
            }
        // Dibuja la pieza en forma de "l"horientado a la izquierda"
        l_right[0][3] = '.';
        l_right[1][3] = '.';
        l_right[2][3] = '.';
        l_right[2][2] = '.';
        
        //Valor de L-right
        value_right=0;
}
public char[][]getl_right(){
    return l_right;
}
public int getValue_right(){
    return value_right;
}
public void rotate_left(){
    switch(value_right){
            //L mirando abajo
            case 0:
            char[][] t1=new char[4][4];
            t1[0][1] = '.';
            t1[0][2] = '.';
            t1[0][3] = '.';
            t1[1][3] = '.';
            value_right=1;
            l_right=t1;
            break;
            //L mirando al costado
            case 1:
            char[][] t2=new char[4][4];
            t2[0][2] = '.';
            t2[1][2] = '.';
            t2[2][2] = '.';
            t2[0][3] = '.';
            value_right=2;
            l_right=t2;
            break;
            //L mirando arriba
            case 2:
            char[][] t3=new char[4][4];
            t3[0][1] = '.';
            t3[1][1] = '.';
            t3[1][2] = '.';
            t3[1][3] = '.';
            value_right=3;
            l_right=t3;
            break;
            
            //L de nuevo normal
            case 3:
            char[][] l2= new char[4][4];
            l2[0][3] = '.';
            l2[1][3] = '.';
            l2[2][3] = '.';
            l2[2][2] = '.';
            value_right=0;
            l_right=l2;
            break;
            }
        }
        public void rotate_right(){
            switch(value_right){
                    //L 
                    case 0:
                    char[][] t1=new char[4][4];
                    t1[0][1] = '.';
                    t1[1][1] = '.';
                    t1[1][2] = '.';
                    t1[1][3] = '.';
                    value_right=3;
                    l_right=t1;
                    break;
                    //L mirando al costado
                    case 3:
                    char[][] t2=new char[4][4];
                    t2[0][3] = '.';
                    t2[0][2] = '.';
                    t2[1][2] = '.';
                    t2[2][2] = '.';
                    value_right=2;
                    l_right=t2;
                    break;
                    //L mirando arriba
                    case 2:
                    char[][] t3=new char[4][4];
                    t3[0][1] = '.';
                    t3[0][2] = '.';
                    t3[0][3] = '.';
                    t3[1][3] = '.';
                    value_right=1;
                    l_right=t3;
                    break;
                    
                    //L de nuevo normal
                    case 1:
                    char[][] l2= new char[4][4];
                    l2[0][3] = '.';
                    l2[1][3] = '.';
                    l2[2][3] = '.';
                    l2[2][2] = '.';
                    value_right=0;
                    l_right=l2;
                    break;
                    }
            }
}
