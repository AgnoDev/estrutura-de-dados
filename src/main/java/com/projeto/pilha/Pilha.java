package com.projeto.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!isEmpty()) {
            No noPop = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPop;
        }
        return null;
    }

    public No top() {              // topo
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {    //retorna v ou f para 'é vazia?'
/*        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;*/
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String retorno = "----------\n";
        retorno += "Pilha\n";
        retorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                retorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        retorno += "==========\n";
        return retorno;
    }
}




