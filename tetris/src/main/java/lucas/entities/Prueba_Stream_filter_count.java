package lucas.entities;

import java.util.Arrays;
import java.util.List;

public class Prueba_Stream_filter_count {
    public static void main (String[]args){
        List<Integer> frutasas=Arrays.asList(79,73,23,44,100,7,9,8,3,1000);
    long cantidadFrutasConA= frutasas.stream()
                            .filter(ronaldo-> ronaldo>20)
                            .filter(ronaldo-> ronaldo%2==0)
                            .filter(ronaldo-> ronaldo>100)
                            .count();
                            System.out.println(" "+ cantidadFrutasConA );
    }
}
