package org.fila;

public class Executora {
    public static void main(String[] args) {
       Fila filaDinamica = new Fila();

       // 5 -> 5 -> 3 -> 1 -> 0 -> 2 -> 4 -> 6 -> 8 -> null
       filaDinamica.enfileirar(new No(8));
       filaDinamica.enfileirar(new No(6));
       filaDinamica.enfileirar(new No(4));
       filaDinamica.enfileirar(new No(2));
       filaDinamica.enfileirar(new No(0));
       filaDinamica.enfileirar(new No(1));
       filaDinamica.enfileirar(new No(3));
       filaDinamica.enfileirar(new No(5));
       filaDinamica.enfileirar(new No(5));
       System.out.println(filaDinamica);

       // 5 -> 5 -> 3 -> 1 -> 0 -> 2 -> 4 -> 6 -> null
       filaDinamica.desenfileirar();
       System.out.println(filaDinamica);

       // 3 -> 1 -> 0 -> 2 -> 4 -> 6 -> null
       filaDinamica.removerTodasOcorrencias(5);
       System.out.println(filaDinamica);

       // true
       System.out.println(filaDinamica.buscar(3));

       // 6
       System.out.println(filaDinamica.maior());

       // 0
       System.out.println(filaDinamica.menor());

       // 2.6
       System.out.println(filaDinamica.media());

       // 6
       System.out.println(filaDinamica.quantidade());

    }
}