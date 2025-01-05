public class Celula {
    private boolean bomba;

    /**No final eu não consegui usar essa classe, pois o 
     * tabuleiro genérico não estava aceitando variáveis
     * do tipo boolean de jeito nenhum, e não consegui corrigir isso
     */

    public Celula(boolean bomba) {
        this.bomba = bomba;
    }

    public void setBomba(boolean bomba) {
        this.bomba = bomba;
    }

    public boolean isBomba() {
        return bomba;
    }
}