package com.projeto.listascirculares;

public class ListaCircular <T>{

    private NoListaCirculares<T> cauda;
    private NoListaCirculares<T> cabeca;
    private int tamanhoLista;

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }
}
