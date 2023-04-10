package com.projeto.listascirculares;

public class ListaCircular<T> {

    private NoListaCirculares<T> cauda;
    private NoListaCirculares<T> cabeca;
    private int tamanhoLista;

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoListaCirculares<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");
        if(index == 0){
            return this.cauda;
        }
        NoListaCirculares<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }
}
