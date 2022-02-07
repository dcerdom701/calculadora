package com.josemanuel.funcion;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class FuncionArea implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner sc) {
        
        //Funcion que devuelve el area de un poligono regular 

        //formula
        System.out.println(" P * A / 2");
        

        //Piden los datos
        System.out.println("Introduzca (P)erímetro:");
        String pStr = sc.next();
        BigDecimal pBD = new BigDecimal(pStr);

        System.out.println("Introduzca (A)potema:");
        String aStr = sc.next();
        BigDecimal aBD = new BigDecimal(aStr);

        //Muestra el resultado y la operacion se hace en la misma salida
        System.out.println("Resultado" + pBD.multiply(aBD).divide(BigDecimal.valueOf(2)).toString());

        return null;
    }

    
}
