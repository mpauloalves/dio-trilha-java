// Classe principal para testar o iPhone
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine");
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
