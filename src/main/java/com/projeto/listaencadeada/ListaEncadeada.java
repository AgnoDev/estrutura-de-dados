package com.projeto.listaencadeada;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;
        for(int i = 0, i < this.size()-1, i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
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
