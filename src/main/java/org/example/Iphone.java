package org.example;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private List<Musica> playlist;
    private List<String> historico;
    private int volume;
    private String paginaInicial;

    public Iphone() {
        this.playlist = new ArrayList<>();
        this.historico = new ArrayList<>();
        this.volume = 50; // Volume inicial
        this.paginaInicial = "http://www.dio.com.br";
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (!playlist.isEmpty()) {
            System.out.println("Tocando música: " + playlist.get(0));
        } else {
            System.out.println("Playlist está vazia.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ajustarVolume(int nivel) {
        this.volume = nivel;
        System.out.println("Volume ajustado para: " + volume);
    }

    @Override
    public void mostrarPlaylist() {
        System.out.println("Playlist:");
        for (Musica musica : playlist) {
            System.out.println(musica);
        }
    }

    @Override
    public void adicionarMusicaPlaylist(Musica musica) {
        playlist.add(musica);
        System.out.println("Música adicionada à playlist: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void ativarVivaVoz() {
        System.out.println("Viva-voz ativado.");
    }

    // Métodos de NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        historico.add(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        if (!historico.isEmpty()) {
            System.out.println("Atualizando página: " + historico.get(historico.size() - 1));
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    @Override
    public void definirPaginaInicial(String url) {
        this.paginaInicial = url;
        System.out.println("Página inicial definida como: " + url);
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Histórico de navegação:");
        for (String url : historico) {
            System.out.println(url);
        }
    }
}