package lucas.entities;

import java.util.Arrays;
import java.util.List;

public class Prueba_Stream_filter_count {
    public static void main (String[]args){
        List<Integer> frutasas=Arrays.asList(79,73,23,44,100);
    long cantidadFrutasConA= frutasas.stream()
                            .filter(ronaldo-> ronaldo>70 && ronaldo<20)
                            .count();
                            System.out.println("Cantidad de frutas que tienen a "+ cantidadFrutasConA );
    }
}
