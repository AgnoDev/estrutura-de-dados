package com.projeto.fila;

import java.util.Optional;

public class MainFila {

    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue("1º");
        minhaFila.enqueue(2);
        minhaFila.enqueue(3.5);
        minhaFila.enqueue(4f);

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);



    }

}
