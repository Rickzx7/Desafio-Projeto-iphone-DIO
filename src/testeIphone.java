import java.util.Scanner;

public class testeIphone {
    public static void main(String[] args) throws Exception {
        iphone meuIphone = new iphone();
        Scanner scanner = new Scanner(System.in);
        int option;

        // teste reprodutor musical
        do {
            System.out.println("Selecione a opção que você deseja: ");
            System.out.println("1 - Reprodutor de musica ");
            System.out.println("2 - Aparelho telefone");
            System.out.println("3 - Navegador de internet");
            System.out.println("0 - sair");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    meuIphone.selecionarMusica("Imagine - John Lennon");
                    meuIphone.tocar();
                    meuIphone.pausar();

                }
                case 2 -> {
                    meuIphone.ligar("11999999999");
                    meuIphone.atender();
                    meuIphone.iniciarCorreioVoz();

                }
                case 3 -> {
                    meuIphone.exibirPagina("https://www.google.com");
                    meuIphone.adicionarPagina();
                    meuIphone.atualizarPagina();

                }

                case 0 -> {
                    System.out.println("encerrando programa");
                    break;
                }
                default -> System.out.println("Opção invalida");
            }

        } while (option != 0);
    }
}
