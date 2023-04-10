package com.projeto.listascirculares;

public class NoListaCirculares<T> {

    private T conteudo;
    private NoListaCirculares<T> proximoNo;

    public NoListaCirculares(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaCirculares<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaCirculares<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaCirculares{" +
                "conteudo=" + conteudo +
                '}';
    }
}
