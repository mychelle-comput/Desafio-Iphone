package org.example;

public interface NavegadorNaInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    void definirPaginaInicial(String url);
    void exibirHistorico();
}

