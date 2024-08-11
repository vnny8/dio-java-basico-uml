public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Neffex - Manifest It");
        System.out.println("");
        iphone.ligar("123");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
