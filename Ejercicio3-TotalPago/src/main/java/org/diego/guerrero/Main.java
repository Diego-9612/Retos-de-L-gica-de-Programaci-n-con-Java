package org.diego.guerrero;


public class Main {
    public static void main(String[] args) {

        Principal principal = new Principal();

        double total = principal.Factura();
        System.out.println("el total a pagar es de" + total);
    }
}