package com.projeto.listaduplamenteencadeada;

public class MainDuplamenteEncadeada {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDupla = new ListaDuplamenteEncadeada<>();
        minhaListaDupla.add("c1");
        minhaListaDupla.add("c2");
        minhaListaDupla.add("c3");
        minhaListaDupla.add("c4");
        minhaListaDupla.add("c5");
        minhaListaDupla.add("c6");
        minhaListaDupla.add("c7");

        System.out.println(minhaListaDupla);
        minhaListaDupla.remove(3);
        System.out.println(minhaListaDupla);
        minhaListaDupla.add2(3, "99");
        System.out.println(minhaListaDupla);


    }
}
