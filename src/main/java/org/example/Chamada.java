package org.example;

public class Chamada {
    private String numero;
    private boolean ativa;

    public Chamada(String numero) {
        this.numero = numero;
        this.ativa = true;
    }

    public void encerrar() {
        this.ativa = false;
    }

    @Override
    public String toString() {
        return "Chamada para " + numero + " [Ativa: " + ativa + "]";
    }
}

