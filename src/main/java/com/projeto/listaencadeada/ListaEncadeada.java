package com.projeto.listaencadeada;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = refEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;

    }

}
