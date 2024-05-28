package org.fila;

public class Executora {
    public static void main(String[] args) {
       Fila filaDinamica = new Fila();

       filaDinamica.enfileirar(new No(0));
       filaDinamica.enfileirar(new No(2));
       filaDinamica.enfileirar(new No(4));
       filaDinamica.enfileirar(new No(5));
       filaDinamica.enfileirar(new No(5));
       filaDinamica.enfileirar(new No(3));
       filaDinamica.enfileirar(new No(5));
        System.out.println(filaDinamica);
        System.out.println(filaDinamica.desenfileirar());
        System.out.println(filaDinamica);
        filaDinamica.removerTodasOcorrencias(5);
        System.out.println(filaDinamica);
        System.out.println(filaDinamica.buscar(3));
        System.out.println(filaDinamica);
        System.out.println(filaDinamica.maior());
        System.out.println(filaDinamica.menor());
        System.out.println(filaDinamica.media());
        System.out.println(filaDinamica.quantidade());
        System.out.println(filaDinamica);

    }
}