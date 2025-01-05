import java.util.Scanner;
public class Menu {
    Scanner sc = new Scanner(System.in);

    //Esses códigos servem apenas para colorir as strings
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public int pedirLinhas() {
        System.out.println("Quantas linhas quer que seu tabuleiro tenha? ");
        int linhas = sc.nextInt();
        return linhas;
    }

    public int pedirColunas() {
        System.out.println("Quantas colunas quer que seu tabuleiro tenha? ");
        int colunas = sc.nextInt();
        return colunas;
    }

    public int exibirMenu() {
        System.out.println("======= MENU =======");
        System.out.println("Escolha o nível de dificuldade do seu jogo:");
        System.out.println("1. Fácil");
        System.out.println("2. Médio");
        System.out.println("3. Difícil");
        System.out.println("0. Sair");
        int escolha = sc.nextInt();
        return escolha;
    }
    
    public int tabTamanho(int escolha){
        int tabTamanho = 0;
        if (escolha == 1) {
            tabTamanho = 4;
        } else if (escolha == 2) {
            tabTamanho = 6;
        } else if (escolha == 3) {
            tabTamanho = 8;
        } else if (escolha == 0) {
            tabTamanho = 0;
            System.out.println("Saindo...");
        }
        return tabTamanho;
    }

    public void instrucoes(){
        System.out.println(ANSI_YELLOW+ "Como jogar Campo Minado:\n- Você escolhe a dificuldade: Fácil, Médio ou Difícil\n- Cada dificuldade vai gerar um tabuleiro diferente, maior ou menor\n- Você tem um número limite de jogadas possíveis, esse número é igual à quantidade de células em uma linha do tabuleiro\n- A quantidade de jogadas varia conforme a dificuldade\n- Seu objetivo é realizar todas as suas jogadas sem selecionar nenhuma bomba!\n- Boa sorte!"+ANSI_RESET);
    }
}
