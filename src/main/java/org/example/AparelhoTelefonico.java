package org.example;

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void enviarMensagem(String numero, String mensagem);
    void ativarVivaVoz();
}
