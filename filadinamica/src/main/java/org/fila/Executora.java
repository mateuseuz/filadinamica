package org.fila;

public class Executora {
    public static void main(String[] args) {
       Fila filaDinamica = new Fila();

       filaDinamica.enfileirar(new No(0));
       filaDinamica.enfileirar(new No(2));
       filaDinamica.enfileirar(new No(4));
       filaDinamica.enfileirar(new No(5));

        System.out.println(filaDinamica);

    }
}