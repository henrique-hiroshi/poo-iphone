public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor
        iphone.selecionarMusica("Hey Jude");
        iphone.tocar();
        iphone.pausar();

        // Telefone
        iphone.ligar("+55 11 99999-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}