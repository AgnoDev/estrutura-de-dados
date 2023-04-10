package com.projeto.listascirculares;

public class MainListasCirculares {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("index-0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
    }
}
