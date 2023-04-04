package com.projeto.fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
    }

    public Fila(No refNoEntradaFila) {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo()!=null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObj();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo()!=null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObj();        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "";
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila!=null){
            while(true){
                retorno += "[No{objeto=" + noAuxiliar.getObj() + "}]--->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    retorno += null;
                    break;
                }
            }
        }else{
            retorno = "null";
        }
        return retorno;
    }
}
