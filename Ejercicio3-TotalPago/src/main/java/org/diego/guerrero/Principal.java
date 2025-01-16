package org.diego.guerrero;

/*
Problema:
- Cada piesa de pan tiene un precio de $500 pesos.
- Si un cliente comprar 50 piezas de pan le costarian $450 pesos.
- Si un cliente comprar 100 piezas de pan le costarian $400 pesos.

En base a lo anterior realizar un programa que en base a las piezas
de pan que el cleinte compre entregar el total a pagar.
 */

import java.util.Scanner;

public class Principal {

    int piezasPan = 0;
    double totalPagar = 0;

    public double Factura (){

        Scanner scs = new Scanner(System.in);
        System.out.println("Ingrese las piezas de pan a pagar");
        piezasPan = scs.nextInt();
        if(piezasPan >= 50 && piezasPan < 100){

            totalPagar = piezasPan * 450;
        } else if (piezasPan >= 100) {

            totalPagar = piezasPan * 400;

        } else {
            totalPagar = piezasPan * 500;
        }
        scs.close();
        return  totalPagar;
    }

}
