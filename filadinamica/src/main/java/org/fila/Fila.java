package org.fila;

public class Fila {
    private No refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enfileirar(No novoNo) {
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public No desenfileirar() {
        if(!this.estaVazia()) {
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean estaVazia() {
     return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntrada;

        if (refNoEntrada != null) {
            while (true) {
                stringRetorno += "[No {" + noAuxiliar.getElemento() + "}] --> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
