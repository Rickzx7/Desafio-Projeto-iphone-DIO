public class iphone implements reprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // AParelho telefonico
    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz...");
    }

    // navegador de internet

    public void exibirPagina(String link) {
        System.out.println("Exibindo a pagina " + link);
    }

    public void adicionarPagina() {
        System.out.println("Adicionando pagina...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
