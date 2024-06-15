package org.example;

public class Usuario {
    public static void main(String[] args) {
        // Criando uma instância de Iphone
        Iphone iphone = new Iphone();

        // Testando funcionalidades do Reprodutor Musical
        System.out.println("=== Testando Reprodutor Musical ===");
        Musica musica1 = new Musica("Nobody", "Internacional");
        iphone.selecionarMusica(musica1);
        iphone.tocar();
        iphone.pausar();
        iphone.ajustarVolume(70);
        iphone.mostrarPlaylist();
        iphone.adicionarMusicaPlaylist(musica1);

        // Testando funcionalidades do Aparelho Telefônico
        System.out.println("\n=== Testando Aparelho Telefônico ===");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.enviarMensagem("987654321", "Olá! Como vai?");
        iphone.iniciarCorreioVoz();
        iphone.ativarVivaVoz();

        // Testando funcionalidades do Navegador na Internet
        System.out.println("\n=== Testando Navegador na Internet ===");
        iphone.definirPaginaInicial("https://www.google.com");
        iphone.exibirPagina("https://www.wikipedia.org");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirHistorico();
    }
}