import java.util.Random;
import java.util.Scanner;

public class Tabuleiro<T> {
    private T[][] celulas;
    private int numeroBombas; // número de bombas

    //Esses códigos servem apenas para colorir as strings
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    // Construtor de tabuleiro
    public Tabuleiro(int linhas, int colunas, int numeroBombas) {
        celulas = (T[][]) new Object[linhas][colunas];
        this.numeroBombas = numeroBombas;
    }

    // Getter do conteúdo das células
    public T getCelula(int linha, int coluna) {
        return celulas[linha][coluna];
    }

    // Getter das bombas
    public int getNumeroBombas() {
        return numeroBombas;
    }

    // Setter das bombas
    public void setBombas(int numeroBombas) {
        this.numeroBombas = numeroBombas;
    }

    // Setter da célula
    public void setCelula(int linha, int coluna, T valor) {
        celulas[linha][coluna] = valor;
    }

    // Getter do tamanho das linhas
    public int getLinhas() {
        return celulas.length;
    }

    // Getter do tamanho dos colunas
    public int getColunas() {
        return celulas[0].length;
    }

    // Método para realizar jogadas
    public void realizarJogada() {
        int nJogadas = 0;
        for (int k = 0; k<getLinhas();k++) {
            System.out.println("Qual a linha da célula que você deseja revelar?");
            int linha = sc.nextInt();
            System.out.println("Qual a coluna da célula que você deseja revelar?");
            int coluna = sc.nextInt();
            while (linha>getLinhas()||coluna>getColunas()) {
                mostrarMensagem(ANSI_RED+"Jogada inválida!"+ANSI_RESET);
                System.out.println();
                System.out.println("Qual a linha da célula que você deseja revelar?");
                linha = sc.nextInt();
                System.out.println("Qual a coluna da célula que você deseja revelar?");
                coluna = sc.nextInt();
            }
            T conteudo = getCelula(linha, coluna);
            if (conteudo == null) {
                this.setCelula(linha, coluna, (T)"X");
                exibirTabuleiro();
                nJogadas++;
                System.out.println(); 
            } else if (conteudo.equals("B")) {
                mostrarMensagem(ANSI_RED + "BOMBA! Você perdeu");
                exibirResposta();
                System.out.println(ANSI_RESET);
                break;               
            }
        }
        if (nJogadas==getLinhas()) {
            mostrarMensagem(ANSI_GREEN+"Parabéns, você não selecionou nenhuma bomba! Veja onde elas estavam:"+ANSI_RESET);
            System.out.println();
            exibirResposta();
        }
    }

    //Método para alocar bombas aleatoriamente
    public void alocarBombas(int nBombas) {
        int linhas = getLinhas();
        int colunas = getColunas();
    
        for (int b =0; b<nBombas; b++) {
            int linhaBomba = random.nextInt(linhas);
            int colunaBomba = random.nextInt(linhas);        
        
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    T conteudo = getCelula(i, j);
                    if (i==linhaBomba && j==colunaBomba) {
                        this.setCelula(i, j, (T)"B" );
                    }
                }       
            }
        }
    }
    
    // Método que exibe o tabuleiro
    public void exibirTabuleiro() {
        int linhas = getLinhas();
        int colunas = getColunas();
    
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                T conteudo = getCelula(i, j);
    
                if (conteudo == null || conteudo.equals("B")) {
                    System.out.print(". "); // Célula vazia ou com bomba oculta
                } else {
                    System.out.print(conteudo + " "); // Exibe o conteúdo da célula
                }
            }
                System.out.println();
        }
    }

    //Método que mostra o resultado ao fim do jogo
    public void exibirResposta() {
        int linhas = getLinhas();
        int colunas = getColunas();
    
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                T conteudo = getCelula(i, j);
    
                if (conteudo == null) {
                    System.out.print(". "); // Célula vazia
                } else {
                    System.out.print(conteudo + " "); // Exibe o conteúdo da célula
                }
            }
                System.out.println();
        }
    }
    
    // Método para mostrar uma mensagem qualquer
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}