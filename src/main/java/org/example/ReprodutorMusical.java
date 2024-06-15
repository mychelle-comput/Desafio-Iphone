package org.example;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(Musica musica);
    void ajustarVolume(int nivel);
    void mostrarPlaylist();
    void adicionarMusicaPlaylist(Musica musica);
}


