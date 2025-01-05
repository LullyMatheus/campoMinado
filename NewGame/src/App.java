import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Crio um menu
        Menu menu = new Menu();

        //Exibir instruções do jogo
        menu.instrucoes();

        // Exibe o menu e obtém a escolha do usuário
        int escolha = menu.exibirMenu();
        int tabTamanho = menu.tabTamanho(escolha);

        //Vamos definir o número de bombas como o tamanho de uma linha
        //Essa é simplesmente uma opção nossa
        int nBombas = tabTamanho;

        //Crio o tabuleiro já no tamanho de acordo com a dificuldade escolhida
        Tabuleiro tabuleiro = new Tabuleiro<>(tabTamanho, tabTamanho, nBombas);

        //Aloco as bombas
        tabuleiro.alocarBombas(nBombas);

        //Exibir o tabuleiro
        tabuleiro.exibirTabuleiro();

        //Realizar jogada
        tabuleiro.realizarJogada();
        menu.exibirMenu();
    }
}
